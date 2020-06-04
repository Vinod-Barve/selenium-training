package testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestAttributesExample {
	
	// Parameters example
	@Test
	@Parameters({"browserName", "browserVersion"})
	public void assertParametersTest(String browserName, String browserVersion) {
		System.out.println("Browser Name is: "+browserName+" Browser version is: "+browserVersion);
	}
	
	// Miscellaneous attributes
	@Test(invocationCount=3)
	public void assertStatementDownloadTest() {
		System.out.println("Test assertStatementDownloadTest Executed");

	}
	
	@Test(expectedExceptions= {ArithmeticException.class, NumberFormatException.class})
	public void assertValidExceptionTest() {
		int a = 5/0; 
	}
	
	@Test(timeOut=2000)
	public void assertTimeOutTest() {
		try {
			Thread.sleep(2001);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// Depends on example
//	@Test(groups= {"smoke", "regression"})
//	public void assertLoginTest() {
//		System.out.println("Test assertLoginTest Executed");
//	}
//	
//	@Test(groups= {"regression"})
//	public void assertSelfAccountTransferMoneyTest() {
//		System.out.println("Test assertEndToEndTransferTest Executed");
//	}
//	
//	@Test(groups= {"regression"})
//	public void assertOtherAccountTransferMoneyTest() {
//		System.out.println("Test assertOtherAccountTransferMoneyTest Executed");
//		Assert.fail();
//	}
//	
//	@Test(dependsOnMethods= {"assertSelfAccountTransferMoneyTest", "assertOtherAccountTransferMoneyTest"})
//	public void assertCummulativeBalanceTest() {
//		System.out.println("Test assertBalanceTest Executed");
//	}
//	
//	@Test(dependsOnMethods= "assertLoginTest", alwaysRun=true)
//	public void assertSessionIsClosedTest() {
//		System.out.println("Test assertSessionIsClosedTest Executed");
//	}
//
//	@Test(dependsOnGroups= {"smoke"})
//	public void assertEndToEndTransferTest() {
//		System.out.println("Test assertEndToEndTransferTest Executed");
//	}
	
	// -ve , no priority, 0, +ve

	@Test(enabled=false)
	public void assertTestA() {
		System.out.println("Test A Executed");
	}
	
	@Test(enabled=false)
	public void assertTestB() {
		System.out.println("Test B Executed");
	}

	@Test(priority=1, enabled=false)
	public void assertTestC() {
		System.out.println("Test C Executed");
	}

	@Test(priority=0, enabled=false)
	public void assertTestD() {
		System.out.println("Test D Executed");
	}
	
	@Test(priority=-1, enabled=false)
	public void assertTestE() {
		System.out.println("Test E Executed");
	}
	
}
