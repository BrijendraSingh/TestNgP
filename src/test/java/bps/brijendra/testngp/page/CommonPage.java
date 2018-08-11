package bps.brijendra.testngp.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import bps.brijendra.testngp.utils.GenericUtils;

public class CommonPage extends GenericUtils {
	public WebDriver driver;
	
	public CommonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchApp() {
		driver.navigate().to(readConfig("AppUrl"));
		String s = "Google News is launched: "+ driver.toString();
		System.out.println(s);
		Reporter.log(s);
	}
	
	
	public void launchApp(String url) {
		driver.navigate().to(url);
		String s = url + ": is launched: " +  driver.toString();
		System.out.println();
		Reporter.log(s);
	}
	
	
	public void closeApp() {
		if (driver!=null) {
			driver.close();
		}else {
			System.out.println("driver is null or already closed");
			Reporter.log("driver is null or already closed");
		}
	}
}
