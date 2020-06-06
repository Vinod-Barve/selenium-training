package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnExample {

	@Test(groups = { "smoke", "regression" })
	public void assertLoginTest() {
		System.out.println("Test assertLoginTest Executed");
	}

	@Test(groups = { "regression" })
	public void assertSelfAccountTransferMoneyTest() {
		System.out.println("Test assertSelfAccountTransferMoneyTest Executed");
	}

	@Test(groups = { "regression" })
	public void assertOtherAccountTransferMoneyTest() {
		System.out.println("Test assertOtherAccountTransferMoneyTest Executed");
		Assert.fail();
	}

	@Test(dependsOnMethods = { "assertSelfAccountTransferMoneyTest", "assertOtherAccountTransferMoneyTest" })
	public void assertCummulativeBalanceTest() {
		System.out.println("Test assertBalanceTest Executed");
	}

	@Test(dependsOnMethods = "assertLoginTest", alwaysRun = true)
	public void assertSessionIsClosedTest() {
		System.out.println("Test assertSessionIsClosedTest Executed");
	}

	@Test(dependsOnGroups = { "regression" })
	public void assertEndToEndTransferTest() {
		System.out.println("Test assertEndToEndTransferTest Executed");
	}

}
