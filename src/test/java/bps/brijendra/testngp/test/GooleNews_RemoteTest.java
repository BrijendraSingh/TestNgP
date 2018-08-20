package bps.brijendra.testngp.test;

import org.testng.annotations.Test;

import bps.brijendra.testngp.page.CommonPage;
import bps.brijendra.testngp.page.GoogleNews;
import bps.brijendra.testngp.utils.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class GooleNews_RemoteTest extends BrowserFactory{
	
	@Test
	public void testOne_SL() {
		System.out.println("testOne Started on Grid Hub");
		WebDriver driver = new BrowserFactory().setWebDeriver("REMOTE_CHROME_SAUCE");
		CommonPage commonpage = new CommonPage(driver);
		commonpage.launchApp();

		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		googlenews.readHeadLines();
		commonpage.closeApp();
	}
	
	
	@Test
	public void testTwo_SL() {
		System.out.println("testTwo Started");
		WebDriver driver = new BrowserFactory().setWebDeriver("REMOTE_FIREFOX_SAUCE");
		CommonPage commonpage = new CommonPage(driver);
		//commonpage.launchApp("https://www.seleniumhq.org/download/");
		commonpage.launchApp();
		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		googlenews.readHeadLines();
		commonpage.closeApp();
	}
	
	@Test
	public void testThree_BS() {
		System.out.println("testThree Started");
		WebDriver driver = new BrowserFactory().setWebDeriver("REMOTE_CHROME_BS");
		CommonPage commonpage = new CommonPage(driver);
		commonpage.launchApp("https://www.seleniumhq.org/");

		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		commonpage.closeApp();
	}
	
	@Test
	public void testFour_BS() {
		System.out.println("testFour Started on grid hub");

		WebDriver driver = new BrowserFactory().setWebDeriver("REMOTE_FIREFOX_BS");
		CommonPage commonpage = new CommonPage(driver);
		commonpage.launchApp("http://testng.org");

		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		commonpage.closeApp();
	}
	
}
