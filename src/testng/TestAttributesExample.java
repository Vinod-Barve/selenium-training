package testng;

import org.testng.annotations.Test;

public class TestAttributesExample {

	@Test(invocationCount = 3)
	public void assertInvocationCountTest() {
		System.out.println("Test assertInvocationCountTest Executed");
	}

	@Test(expectedExceptions = { ArithmeticException.class, NumberFormatException.class })
	public void assertValidExceptionTest() {
		System.out.println("Test assertValidExceptionTest Executed");
		int a = 5 / 0;
	}

	@Test(timeOut = 2000)
	public void assertTimeOutTest() {
		System.out.println("Test assertTimeOutTest Executed");
		try {
			Thread.sleep(2001);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(enabled = false)
	public void assertEnabledTest() {
		System.out.println("Test assertEnabledTest Executed");
	}

	@Test(groups = "smoke")
	public void assertGroupsTest() {
		System.out.println("Test assertGroupsTest Executed");
	}

	@Test(priority = 1)
	public void assertPriorityTest() {
		System.out.println("Test assertPriorityTest Executed");
	}

	@Test(dependsOnMethods = { "assertPriorityTest" })
	public void assertDependsOnMethodTest() {
		System.out.println("Test assertDependsOnMethodTest Executed");
	}

	@Test(dependsOnGroups = { "smoke", "regression" })
	public void assertDependsOnGroupsTest() {
		System.out.println("Test assertDependsOnGroupsTest Executed");
	}
}
