package bps.brijendra.testngp.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bps.brijendra.testngp.configuration.BrowerConfig;
import bps.brijendra.testngp.page.GoogleNews;
import bps.brijendra.testngp.utils.BrowserFactory;

public class GooleNewsTest {
	@BeforeMethod
	public void setup() {
		BrowserFactory.setWebDeriver(BrowerConfig.CHROME.toString());
	}
	
	@Test
	public void testOne() {
		System.out.println("testOne Started");
		GoogleNews gnews = new GoogleNews();
		gnews.launchApp();
		gnews.CloseApp();
	}
	
	@Test
	public void testTwo() {
		System.out.println("testTwo Started");
		GoogleNews gnews = new GoogleNews();
		gnews.launchApp();
		gnews.CloseApp();
	}
	
	@Test
	public void testThree() {
		System.out.println("testThree Started");
		GoogleNews gnews = new GoogleNews();
		gnews.launchApp();
		gnews.CloseApp();
	}
	
	@Test
	public void testFour() {
		System.out.println("testFour Started");
		GoogleNews gnews = new GoogleNews();
		gnews.launchApp();
		gnews.CloseApp();
	}
	
	@AfterMethod
	public void teardown() {
		//BrowserFactory.teardown();
	}

}
