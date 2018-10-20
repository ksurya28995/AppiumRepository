package AppiumCore;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager{
	final static public String fileName = "androidConfig.properties";
	static Properties prop = new Properties();
	static InputStream input = null;
	
	public static String getPropertyValue(String valueHead) {
		try {
		input = PropertyManager.class.getClassLoader().getResourceAsStream(fileName);
		if(input==null) {
			System.out.println("Unable to find the "+fileName);
			throw new FileNotFoundException();
		} 
		prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop.getProperty(valueHead.toLowerCase());
	}
}

