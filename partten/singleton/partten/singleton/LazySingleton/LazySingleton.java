package partten.singleton.LazySingleton;


public class LazySingleton {
	private static LazySingleton m_instance = null;

	private LazySingleton() {
	}

	synchronized static public LazySingleton getInstance() {
		if (m_instance == null) {
			m_instance = new LazySingleton();
		}
		
		return m_instance;
	}
}