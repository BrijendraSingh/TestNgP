package bps.brijendra.testngp.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public static WebDriver driver;

	public void launchURL(String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}

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
