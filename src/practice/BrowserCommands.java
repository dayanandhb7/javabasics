package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	
	
	

		 public static void main(String[] args) {
		  
		  // Expected Title
		  String expectedTitle = "Techlistic";

		  // Set Path of the Chrome driver
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

		  // Open URL of Website
		  driver.get("https://www.techlistic.com");

		  // Maximize Window
		  driver.manage().window().maximize();
		  
		  // Get Title of current Page
		  String actualTitle = driver.getTitle();
		  System.out.println("Title fetched: "+ actualTitle);
		  
		  // Validate/Compare Page Title
		  if(expectedTitle.equals(actualTitle)) {
		   System.out.println("Test Case Passed.");
		  }
		  else {
		   System.out.println("Test Case Failed.");
		  }
		  
		  
		 }
		 

		}
	

