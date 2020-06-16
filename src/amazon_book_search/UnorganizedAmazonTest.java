package amazon_book_search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnorganizedAmazonTest {
	String url = "https://www.amazon.in";
	WebDriver driver;
	WebDriverWait wait;
	int explicitWait = 30;
	String driverPath = System.getProperty("user.dir")+"/src/driver/chromedriver.exe";

	@Test
	public void assertBookSearchTest() {
		String bookName = "The Kite Runner";

		// Open URL
		driver.get(url);

		// Enter book name in search field
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		searchBox.sendKeys("The Kite Runner");

		// Click on Search button
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();

		// First Book Name
		WebElement firstResult = driver.findElement(By.xpath("(//div[contains(@class, 's-search-results')]//h2[contains(@class, 'a-size-mini')])[2]"));
		wait.until(ExpectedConditions.visibilityOf(firstResult));
		String actualBookName = firstResult.getText();
		System.out.print("First book name is: " + actualBookName);

		// Assert book name
		Assert.assertEquals(actualBookName, bookName, "Book Name is not correct");

	}

	@BeforeMethod
	public void openBrowser() {
		// Open browser
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		// Set explicit wait
		wait = new WebDriverWait(driver, 30);
	}

	@AfterMethod
	public void closeBrowser() {
		// Close Browser
		driver.quit();
	}
}
