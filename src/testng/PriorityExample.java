package testng;

import org.testng.annotations.Test;

public class PriorityExample {

	// Priority Order : -ve , no priority, 0, +ve

	@Test
	public void assertTestA() {
		System.out.println("Test A Executed");
	}

	@Test
	public void assertTestB() {
		System.out.println("Test B Executed");
	}

	@Test(priority = 1)
	public void assertTestC() {
		System.out.println("Test C Executed");
	}

	@Test(priority = 0)
	public void assertTestD() {
		System.out.println("Test D Executed");
	}

	@Test(priority = -1)
	public void assertTestE() {
		System.out.println("Test E Executed");
	}
}
