package partten.singleton.regSingleton;


import java.lang.String;

public class RegSingletonChild extends RegSingleton {
	public RegSingletonChild() {
		System.out.println("RegSingletonChild object created!");
	}

	static public RegSingletonChild getInstance() {
		return (RegSingletonChild)RegSingleton.getInstance("partten.singleton.regSingleton.RegSingletonChild");
	}

	public String about() {
		return "Hello, I am RegSingletonChild.";
	}
}