package bps.brijendra.testngp.page;

import org.openqa.selenium.support.PageFactory;

import bps.brijendra.testngp.configuration.BrowerConfig;
import bps.brijendra.testngp.utils.BrowserFactory;
import bps.brijendra.testngp.utils.GenericUtils;

public class GoogleNews extends GenericUtils {
	
	public GoogleNews() {
		PageFactory.initElements(driver, this);
	}
	
	public void launchApp() {
		
		launchURL(readConfig("AppUrl"));
		System.out.println("Google News is launched");
		
	}
	
	public void CloseApp() {
		System.out.println("Browser is closed");
	}
}
