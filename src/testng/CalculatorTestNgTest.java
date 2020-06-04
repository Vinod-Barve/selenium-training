package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestNgTest extends CalculatorTestNg{

	@Test
	public void assertAdditionTest() {
		int a = 5, b = 5;
		
		int expectedAddtion = 10;
		int actualAddition = addition(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual addition is: "+actualAddition+"\nExpected addition is: "+expectedAddtion);
		Assert.assertEquals(actualAddition, expectedAddtion,  "Addition of two numbers is not correct");
	}
	
	@Test
	public void assertSubstractionTest() {
		int a = 5, b = 5;
		
		int expectedSubstraction = 0;
		int actualSubstraction = substraction(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual substration is: "+actualSubstraction+"\nExpected subraction is: "+expectedSubstraction);
		
		Assert.assertEquals(actualSubstraction, expectedSubstraction, "Subraction of two numbers is not correct");
		
	}
	
	@Test
	public void assertDivisionTest() {
		int a = 5, b = 5;
		
		int expectedDivision = 2;
		int actualDivision = division(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual division is: "+actualDivision+"\nExpected division is: "+expectedDivision);
		
		Assert.assertEquals(actualDivision, expectedDivision, "Division of two numbers is not correct");
		
	}
	
	@Test
	public void assertMultiplicationTest() {
		int a = 5, b = 5;
		
		int expectedMultiplication = 20;
		int actualMultiplication = multiplication(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual multiplication is: "+actualMultiplication+"\nExpected multiplication is: "+expectedMultiplication);
		
		Assert.assertEquals(actualMultiplication, expectedMultiplication, "Multiplication of two numbers is not correct");			
	}
	
	
}
