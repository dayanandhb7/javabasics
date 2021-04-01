package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadiobutton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));

		radio1.click();
		System.out.println("Radio Button Option 1 Selected");

		radio2.click();
		System.out.println("Radio Button Option 2 Selected");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();

		if (option1.isSelected()) {
			System.out.println("checkbox is toggled on");
		} else {
			System.out.println("checkbox is toggled off");
		}

	}

}
