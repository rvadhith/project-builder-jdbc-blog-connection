package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws Exception {
		
		//Generating property object and obtaining info from loadpropertiesFile() method
		Properties prop = null;
		prop = loadPropertiesFile();
		
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Establishing connection
		Class.forName(driver);
		Connection con = null;
		con = DriverManager.getConnection(url,username,password);
		
		return con;
	}

	
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}


