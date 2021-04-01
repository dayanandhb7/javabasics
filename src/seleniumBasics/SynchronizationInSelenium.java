package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// implicitly wait -- is always applied globally -- is available for all the
		// elements
		// dynamic in nature
		// it can be changed anywhere and at anytime in your code
 
		driver.get("https://www.facebook.com/");

		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));

		WebElement mobileNum = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));

		sendKeys(driver, firstName, 10, "tom");
		sendKeys(driver, lastName, 5, "peter");
		sendKeys(driver, mobileNum, 5, "7382726078");
		sendKeys(driver, password, 10, "hgvdhgv");

		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver, forgotAccount, 20);
	}

	// Explicit Wait :
	// 1. No Explicit keyword or method
	// 2. available with WebDriverWait with some ExpectedConditions
	// 3. specific to element
	// 4. dynamic in nature
	// 5. We should never use implicit wait and explicit wait together : selenium
	// webdriver will wait for the element first
	// -- because of Implicit Wait and then Exsplicit Wait will be applied hence
	// total sync wait will be increased for each element

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) throws InterruptedException {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

}
