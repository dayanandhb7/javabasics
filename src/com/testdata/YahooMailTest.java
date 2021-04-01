package com.testdata;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooMailTest {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch FF");
	}

	@BeforeMethod
	public void login() {
		System.out.println("login to app");
	}

	
	@Test(priority = 1)
	public void composeMail() {
		System.out.println("compose mail");
	}
	
	@Test(priority = 2,enabled = false)
	public void deleteMail() {
		System.out.println("delete mail");
	}
	
	@Test(priority = 3)
	public void searchMail() {
		System.out.println("search mail");
	}
	 
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void quitBrowser() {
		System.out.println("quit browser");
	}
	
	
	
}
