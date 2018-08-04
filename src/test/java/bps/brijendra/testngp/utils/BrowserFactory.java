package bps.brijendra.testngp.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver driver;

	public static WebDriver setWebDeriver(String browser) {

		switch (browser) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/bps/brijendra/testngp/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "MOZILA":

			break;
		case "IE":

			break;
		case "NEW":

			break;
		default:
			break;
		}
		GenericUtils.driver = driver;
		return driver;
	}
	
	public static void teardown() {
		if (driver!=null) {
			driver.close();
		}
	}

}
