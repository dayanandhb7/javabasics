package MoveTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveTo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"teamDropDown\"]/a"));
		action.moveToElement(element).build().perform();
		driver.findElement(By.xpath("//a[text()='Australia']")).click();
		
		
		
	}

}
