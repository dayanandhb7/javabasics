package javaPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu1\"]")).click();
		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu test']//li/a"));

		for (int i = 0; i < dd_menu.size(); i++) {
			WebElement element = dd_menu.get(i);
			String innerhtml = element.getAttribute("innerHTML");
			System.out.println(innerhtml);
		}

	}

}
