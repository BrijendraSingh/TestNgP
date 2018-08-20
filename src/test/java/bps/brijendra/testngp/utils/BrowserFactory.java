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
	public static final String USERNAME_BS = "USERNAME";
	public static final String AUTOMATE_KEY_BS = "ACCESS_KEY";
	public static final String USERNAME_SL = "USERNAME";
	public static final String AUTOMATE_SL = "ACCESS_KEY";
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
				driver = new RemoteWebDriver(new URL("http://localhost:4546/wd/hub"), cap_firfox);
			} catch (MalformedURLException e) {
				System.out.println("Exception in remotewebdriver: " +e.getMessage());
			}
			break;
		case "REMOTE_CHROME":
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/bps/brijendra/testngp/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			DesiredCapabilities cap_chrome = new DesiredCapabilities();
			cap_chrome.setPlatform(Platform.WIN10);
			cap_chrome.setBrowserName("chrome");
			options.merge(cap_chrome);
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4547/wd/hub"), cap_chrome);
			} catch (MalformedURLException e) {
				System.out.println("Exception in remotewebdriver: " +e.getMessage());
			}
			break;
		case "REMOTE_CHROME_SAUCE":
		
			break;
		case "REMOTE_FIREFOX_SAUCE":
			
			break;
			
		case "REMOTE_CHROME_BS":
			DesiredCapabilities cap_chrome_bs = new DesiredCapabilities();
			cap_chrome_bs.setCapability("browser", "Chrome");
			cap_chrome_bs.setCapability("browser_version", "62.0");
			cap_chrome_bs.setCapability("os", "Windows");
			cap_chrome_bs.setCapability("os_version", "10");
			cap_chrome_bs.setCapability("resolution", "1366x768");
			
			ChromeOptions options_bs = new ChromeOptions();
			options_bs.addArguments("--disable-plugins");
			
			cap_chrome_bs.setCapability(ChromeOptions.CAPABILITY, options_bs);
			try {
				driver = new RemoteWebDriver(new URL("https://" + USERNAME_BS + ":" + AUTOMATE_KEY_BS + "@hub-cloud.browserstack.com/wd/hub"), cap_chrome_bs);
			} catch (MalformedURLException e) {
				System.out.println("Exception in remotewebdriver: " +e.getMessage());
			}
			break;
		case "REMOTE_FIREFOX_BS":
			
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
