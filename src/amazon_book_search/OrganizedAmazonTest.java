package amazon_book_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrganizedAmazonTest extends CommonMethods{
	
//	CommonMethods commonMethods = new CommonMethods();
	AmazonPage amazonPage = new AmazonPage();

	@Test
	public void assertBookSearchTest() {
		String bookName = "The Kite Runner";
		String url = "https://www.amazon.in";

		// Open URL
		openUrl(url);

		// Enter book name in search field
		amazonPage.enterTextInSearchBox(bookName);

		// Click on Search button
		amazonPage.clickSearchButton();		

		// Assert book name
		amazonPage.assertSearchedBookIsCorrect(bookName);

	}
}
