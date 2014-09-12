package partten.singleton.propertiesManager;


import java.io.File;
import java.io.FileInputStream;
import java.lang.Object;
import java.lang.String;
import java.util.Properties;

public class ConfigManager {
	// 属性文件全名
	private static String PFILE = System.getProperty("user.dir") + File.separator+ "singleton"  + File.separator +
			"partten" + File.separator + "singleton" + File.separator + "propertiesManager" + File.separator + "Singleton.properties";
	// 对应于属性文件的文件对象变量
	private File m_file = null;
	// 属性文件的最后修改日期
	private long m_lastModifiedTime = 0;
	// 属性文件所对应的属性对象变量
	private Properties m_properties = null;
	// 本类可能存在的唯一的一个实例
	private static ConfigManager m_instance = new ConfigManager();

	/**
	 * 私有构造函数，用以保证外界无法直接实例化
	 */
	private ConfigManager() {
		m_file = new File(PFILE);
		m_lastModifiedTime = m_file.lastModified();
		if (m_lastModifiedTime == 0) {
			System.err.println(PFILE + " file does not exist!");
		}
		
		m_properties = new Properties();
		try {
			m_properties.load(new FileInputStream(PFILE));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 静态工厂方法
	 * @return 返还ConfigManager类的单一实例
	 */
	synchronized static public ConfigManager getInstance() {
		return m_instance;
	}

	/**
	 * 读取v一个特定的属性项
	 * @param name					属性项的项名
	 * @param defaultValue	属性项的默认值
	 * @return		属性项的值（此项如果存在），默认值（如果此项不存在）
	 */
	final public Object getConfigItem(String name, Object defaultValue) {
		long newTime = m_file.lastModified();
		
		// 检查属性文件是否被其他程序修改过，如果是，重新读取此文件
		if (newTime == 0) {
			// 属性文件不存在
			if (m_lastModifiedTime == 0) {
				System.err.println(PFILE + " file does not exist!");
			}
			else {
				System.err.println(PFILE + " file was deleted!");
			}

			return defaultValue;
		}
		else  if (newTime > m_lastModifiedTime) {
			// 属性文件存在，但已在上次加载后被修改，需重新加载
			m_properties.clear();
			try {
				m_properties.load(new FileInputStream(PFILE));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		m_lastModifiedTime = newTime;
		Object val = m_properties.getProperty(name);
		
		if (val == null) {
			return defaultValue;
		}
		else {
			return val;
		}
	}
}