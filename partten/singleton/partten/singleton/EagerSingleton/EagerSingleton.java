package partten.singleton.EagerSingleton;


public class EagerSingleton {
	private static final EagerSingleton m_instance = new EagerSingleton();

	private EagerSingleton() {
	}

	static public EagerSingleton getInstance() {
		return m_instance;
	}
}

