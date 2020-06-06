package testng;

import java.util.Calendar;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAndDataProviderExample {

	@Test
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
	
	@Test(dataProvider="dataProviderWithoutCustomName")
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

	@Test(dataProvider="customDataProvider")
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

		@Test(dataProvider="externalDataProvider", dataProviderClass=ExternalDataProviderClass.class)
		public void assertExternalDataProviderTest(String userName) {
			System.out.println("Today's message is: "+userName);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}


class ExternalDataProviderClass{
	
	@DataProvider(name="externalDataProvider", parallel=true)
	public static Object[] externalDataProvider() {
		Object[] weekDays = new Object[7];
		
		weekDays[0] = "Happy Monday !!!";
		weekDays[1] = "Happy Tuesday !!!";
		weekDays[2] = "Happy Wednesday !!!";
		weekDays[3] = "Happy Thursday !!!";
		weekDays[4] = "Happy Friday !!!";
		weekDays[5] = "Happy Saturday !!!";
		weekDays[6] = "Happy Sunday !!!";

		return weekDays;	
	}
}
