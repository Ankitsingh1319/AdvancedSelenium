package generic_utility;

import java.io.FileInputStream;

import java.util.Properties;
/**
 * @author Anshu
 */
public class property_file_utility extends webdriver_utility{

	/**
	 * this method is used to fetch the data from property file
	 * @return
	 * @throws Exception
	 */
	public static String  property(String key) throws Exception
	{
		FileInputStream file=new FileInputStream(Iconstant.property_path);
		p=new Properties();
		p.load(file);
		return p.getProperty(key);
	}
}
