package testng;

import java.util.Calendar;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAndDataProviderExample {
	
	@Test(enabled=false)
	@Parameters({ "browserName", "browserVersion" })
	public void assertParametersTest(String browserName, String browserVersion) {
		System.out.println("Browser Name is: " + browserName + " Browser version is: " + browserVersion);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test is finished");
	}
	
	// DataProvider Example One 
	
	@Test(dataProvider="dataProviderWithoutCustomName", enabled=false)
	public void assertDataProviderWithoutustomNameTest(String userName, String password) {
		System.out.println("Username is : "+userName+" Password is: "+password);
	}
	
	@DataProvider
	public Object[][] dataProviderWithoutCustomName() {
	 Object[][] userCredentials  = {
			 {"User 1", "Password 1"},
			 {"User 2", "Password 2"},
			 {"User 3", "Password 3"},
	 };
		
		return userCredentials;
	}
	
	// DataProvider Example Two 

	@Test(dataProvider="customDataProvider", enabled=false)
	public void assertDataProviderWithCustomNameTest(int userId, String userName) {
		System.out.println("User Id is: "+userId+" Username is : "+userName);
	}
	
	
	@DataProvider(name="customDataProvider")
	public Object[][] dataProviderWithCustomName() {
	 Object[][] userData  = {
			 {new Integer(1), "User 1"},
			 {new Integer(2), "User 2"},
			 {new Integer(3), "User 3"}
	 };
		
		return userData;
	}
	
	// DataProvider Example Three

		@Test(dataProvider= "externalDataProvider", dataProviderClass=ExternalDataProviderClass.class)
		public void assertExternalDataProviderTest(String message) {
			String expectedTodaysDay = "Monday";
			Assert.assertTrue(message.contains(expectedTodaysDay), "Today's days message is not correct");
			
			System.out.println("Today's message is: "+message);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
