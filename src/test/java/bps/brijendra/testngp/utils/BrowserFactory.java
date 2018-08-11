package bps.brijendra.testngp.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {

	public RemoteWebDriver driver;

	public WebDriver setWebDeriver(String browser) {

		switch (browser) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/bps/brijendra/testngp/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "MOZILA":

			break;
		case "REMOTE_FIREFOX":
			DesiredCapabilities cap_firfox = new DesiredCapabilities().firefox();
			cap_firfox.setPlatform(Platform.WIN10);
			cap_firfox.setBrowserName("firefox");
			//options.merge(cap);
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.49.20:4546/wd/hub"), cap_firfox);
			} catch (MalformedURLException e) {
				System.out.println("Exception in remotewebdriver: " +e.getMessage());
			}
			break;
		case "REMOTE_CHROME":
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/bps/brijendra/testngp/drivers/chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
			DesiredCapabilities cap_chrome = new DesiredCapabilities().chrome();
			cap_chrome.setPlatform(Platform.WIN10);
			cap_chrome.setBrowserName("chrome");
			//options.merge(cap);
			try {
				driver = new RemoteWebDriver(new URL("http://192.168.49.20:4547/wd/hub"), cap_chrome);
			} catch (MalformedURLException e) {
				System.out.println("Exception in remotewebdriver: " +e.getMessage());
			}
			break;
		default:
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
