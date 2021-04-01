package MoveTo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaSE_Test {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");

		
		
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        js.executeScript("window.scrollBy(0,3000)");

		
		
		
		
		
		
	}

}
