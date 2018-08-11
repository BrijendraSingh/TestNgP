package bps.brijendra.testngp.test;

import org.testng.annotations.Test;

import bps.brijendra.testngp.page.CommonPage;
import bps.brijendra.testngp.page.GoogleNews;
import bps.brijendra.testngp.utils.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class GooleNewsTest extends BrowserFactory{
	
	@Test
	public void testOne() {
		System.out.println("testOne Started on Grid Hub");
		WebDriver driver = new BrowserFactory().setWebDeriver("REMOTE_CHROME");
		CommonPage commonpage = new CommonPage(driver);
		commonpage.launchApp();

		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		googlenews.readHeadLines();
		commonpage.closeApp();
	}
	
	
	@Test
	public void testTwo() {
		System.out.println("testTwo Started");
		WebDriver driver = new BrowserFactory().setWebDeriver("REMOTE_FIREFOX");
		CommonPage commonpage = new CommonPage(driver);
		//commonpage.launchApp("https://www.seleniumhq.org/download/");
		commonpage.launchApp();
		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		googlenews.readHeadLines();
		commonpage.closeApp();
	}
	
	@Test
	public void testThree() {
		System.out.println("testThree Started");
		WebDriver driver = new BrowserFactory().setWebDeriver("CHROME");
		CommonPage commonpage = new CommonPage(driver);
		commonpage.launchApp("https://www.seleniumhq.org/");

		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		commonpage.closeApp();
	}
	
	@Test
	public void testFour() {
		System.out.println("testFour Started on grid hub");

		WebDriver driver = new BrowserFactory().setWebDeriver("REMOTE");
		CommonPage commonpage = new CommonPage(driver);
		commonpage.launchApp("http://testng.org");

		GoogleNews googlenews = new GoogleNews(driver);
		googlenews.readGnews();
		commonpage.closeApp();
	}
	
}
