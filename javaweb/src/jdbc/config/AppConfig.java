package jdbc.config;

import java.util.Properties;

public class AppConfig {

	private static Properties prop = new Properties();

	static {
		try {
			prop.load(AppConfig.class.getResourceAsStream("config-mysql.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static final String NAME = prop.getProperty("name");
	public static final String PWD = prop.getProperty("pwd");
	public static final String URL = prop.getProperty("url");
	public static final String DRIVER = prop.getProperty("driver");

}
