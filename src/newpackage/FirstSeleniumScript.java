package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://login.yahoo.com/");

driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("lionelmessi10.com");
Thread.sleep(10000);
driver.findElement(By.linkText("Next")).click();




	}
}
