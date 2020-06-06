package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsExample {

	@Test(groups = "smoke")
	public void testMethodOne() {
		System.out.println("**********Inside testMethodOne**********");
	}

	@Test
	public void testMethodTwo() {
		System.out.println("**********Inside testMethodTwo**********");
	}

	@Test
	public void testMethodThree() {
		System.out.println("**********Inside testMethodThree**********");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("**********Before Suite**********");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("**********After Suite**********");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("**********Before Test**********");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("**********After Test**********");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("**********Before Class**********");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("**********After Class**********");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("**********Before Method**********");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("**********After Method**********");
	}

	@BeforeGroups("smoke")
	public void beforeGroups() {
		System.out.println("**********Before Groups**********");
	}

	@AfterGroups("smoke")
	public void afterGroups() {
		System.out.println("**********After Groups**********");
	}

}
