package partten.singleton.regSingleton;

import java.lang.String;
import java.util.HashMap;

public class RegSingleton {
	static private HashMap<String, Object> m_registry = new HashMap<String, Object>();
	
	static {
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}
	
	protected RegSingleton() {
		System.out.println("RegSingleton object created!");
	}

	static public RegSingleton getInstance(String name) {
		if (name == null) {
			name = "partten.singleton.regSingleton.RegSingleton";
		}
		
		if (m_registry.get(name) == null) {
			try {
				m_registry.put(name, Class.forName(name).newInstance());
			}
			catch (Exception e) {
				System.out.println("Error happened");
			}
		}
		return (RegSingleton)(m_registry.get(name));
	}

	public String about() {
		return "Hello, I am RegSingleton.";
	}
}