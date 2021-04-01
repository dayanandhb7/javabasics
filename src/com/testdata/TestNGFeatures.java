package com.testdata;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test(groups = "login")
	public void loginTest() {
		System.out.println("login test");
	
	}
	
	@Test
	public void HomePageTest() {
		System.out.println("HomePage Test");
	}
	
	@Test
	public void SearchPageTest() {
		System.out.println("SearchPage Test");
	}
	
	@Test(groups = "login")
	public void RegPageTest() {
		System.out.println("RegPage Test");
	}
	
}
