package bps.brijendra.testngp.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import bps.brijendra.testngp.utils.GenericUtils;

public class GoogleNews extends GenericUtils {
	WebDriver driver;

	@FindBy(css="article h3 a")
	List<WebElement> headlines;
	
	public GoogleNews(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void readGnews() {
		System.out.println(driver.getTitle() +" :: " +driver.toString());
		Reporter.log(driver.getTitle() +" :: " +driver.toString());
	}

	public void readHeadLines(){
		for (WebElement headln : headlines){
			System.out.println("--> " + headln.getText());
			Reporter.log("--> " + headln.getText());
		}
	}
}
