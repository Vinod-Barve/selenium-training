package amazon_book_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AmazonPage extends CommonMethods{
	WebDriver driver;
	
	public AmazonPage() {
		this.driver = getWebDriver();
	}
	
	// Locators
	public WebElement searchTextBox() {
		return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}
	
	public WebElement searchButton() {
		return driver.findElement(By.xpath("//input[@value='Go']"));
	}
	
	public WebElement firstSearchResult() {
		return driver.findElement(By.xpath("(//div[contains(@class, 's-search-results')]//h2[contains(@class, 'a-size-mini')])[2]"));
	}
	
	// Methods working on locators
	public void enterTextInSearchBox(String searchText) {
		enterText(searchTextBox(), searchText);
	}
	
	public void clickSearchButton() {
		click(searchButton());
	}
	
	// Assertion methods
	public void assertSearchedBookIsCorrect(String expectedBookName) {
		String actualBookName = getText(firstSearchResult());
		Assert.assertEquals(actualBookName, expectedBookName, "Searched book name is not correct");
	}
}
