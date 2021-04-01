package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class HalfEbayTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("");
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
	ArrayList<Object[]>  testData =	TestUtil.getDataFromExcel();
	return testData.iterator();
	}
	
	@Test(dataProvider="getTestData")
	public void halfEbayRegPageTest(String firstName,String lastName,String address1,String address2,
			String city,String state,String zipCode,String emailAddress){
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(firstName);

		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(lastName);

		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(address1);

		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(address2);

		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(city);

		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByVisibleText(state);
		
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(zipCode);

		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(emailAddress);

		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys(emailAddress);
		}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}	
}