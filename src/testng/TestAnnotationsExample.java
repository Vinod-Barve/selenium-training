package testng;

import org.testng.annotations.Test;

public class TestAnnotationsExample {

	@Test
	public void assertTestA() {
		System.out.println("Test A Executed");
	}
	
	@Test
	public void assertTestB() {
		System.out.println("Test B Executed");
	}

	@Test(priority=1)
	public void assertTestC() {
		System.out.println("Test C Executed");
	}

	@Test(priority=0)
	public void assertTestD() {
		System.out.println("Test D Executed");
	}
	
	@Test(priority=-1, groups= {"smoke"})
	public void assertTestE() {
		System.out.println("Test E Executed");
	}
	
	@Test(dependsOnMethods="assertTestE", enabled=false)
	public void assertDependsOnMethodTest() {
		System.out.println("Test assertDependsOnMethod Executed");
	}

	@Test(dependsOnGroups= {"smoke"}, enabled=false)
	public void assertDependsOnGroupsTest() {
		System.out.println("Test assertDependsOnGroupsTest Executed");
	}

	// -ve , no priority, 0, +ve
}
