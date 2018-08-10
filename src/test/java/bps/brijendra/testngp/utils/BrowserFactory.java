package bps.brijendra.testngp.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public WebDriver driver;

	public WebDriver setWebDeriver(String browser) {

		switch (browser) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/bps/brijendra/testngp/drivers/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "/usr/bin/geckodriver");
			driver = new ChromeDriver();
			break;
		case "MOZILA":
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
			driver = new FirefoxDriver();
			break;
		case "IE":

			break;
		case "NEW":

			break;
		default:
			System.out.println("No Broser found with [" + browser + "] name");
			break;
		}
		System.out.println(driver.toString());
		return driver;
	}
	
	public void teardown() {
		if (driver!=null) {
			driver.close();
		}
	}

}
