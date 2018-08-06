package bps.brijendra.testngp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public String readConfig(String key) {
		String value=null;
		File file = new File(
				System.getProperty("user.dir") + "/src/test/java/bps/brijendra/testngp/configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			value= prop.getProperty(key);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return value;
	}
}
