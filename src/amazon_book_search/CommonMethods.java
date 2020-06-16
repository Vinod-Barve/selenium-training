package amazon_book_search;

import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class CommonMethods {
	public WebDriver driver;
	public WebDriverWait wait;
	int explicitWait = 30;
	String driverPath = "C:\\Users\\hp\\Desktop\\Selenium Basics\\Driver\\chromedriver.exe";
	
	@BeforeMethod
	public void invokeBrowser() {		
		System.setProperty("webdriver.chrome.driver", driverPath); 
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		driver.manage().deleteAllCookies();	
		driver.manage().window().maximize();
	
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void openUrl(String url) {
		driver.get(url);
	}
	
	public void navigateForward() {
		driver.navigate().forward();
	}

	public void navigateBack() {
		driver.navigate().back();
	}
	
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public void enterText(WebElement element, String text) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(text);
	}
	
	public void clearText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
	}
	
	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
		
}
