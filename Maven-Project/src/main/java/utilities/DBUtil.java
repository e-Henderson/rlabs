package utilities;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	private static DBUtil _instance;
	private Connection conn = null;
	
	private DBUtil() {}//private constructor, no-args
	
	//this is a singleton
	public static DBUtil getInstance() {
		if(_instance == null) {
			_instance = new DBUtil();//calls on the above constructor
		}
		return _instance;
	}
	
	public Connection getConnection() throws SQLException {
		if(this.conn == null) {
			
			String configFilePath = System.getProperty(Const.Config_File);//**update to file stream line "C:\\Users\\ethen\\OneDrive\\Documents\\db-util.properties"
			
			try(FileInputStream fis = new FileInputStream(configFilePath)){//need to place file name here 
			
					Properties prop =new Properties();
					prop.load(fis);
					this.conn = DriverManager.getConnection(prop.getProperty(Const.db_url),prop.getProperty(Const.db_username),prop.getProperty(Const.db_password));
					
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return this.conn;
	}
}
