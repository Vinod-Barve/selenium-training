package java_program;

public class CalculatorTest extends Calculator{

//	public CalculatorTest() {
//		
//		assertAdditionTest();
//		assertSubstractionTest();		
//		assertDivisionTest();
//		assertMultiplicationTest();
//		
//		// Dependency 
////		if(assertAdditionTest() && assertSubstractionTest()) {
////			
////			assertDivisionTest();
////			assertMultiplicationTest();
////			
////		}
//		
//	}
	
	
	public boolean assertAdditionTest() {
		boolean isPass = false;
		int a = 5, b = 5;
		
		int expectedAddtion = 10;
		int actualAddition = addition(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual addition is: "+actualAddition+"\nExpected addition is: "+expectedAddtion);

		if(actualAddition==expectedAddtion) {
			System.out.println("Addition of two numbers is correct\n");
			isPass = true;
		} else {
			System.out.println("Addition of two numbers is not correct\n");
		}	
		return isPass;
	}
	
	public boolean assertSubstractionTest() {
		boolean isPass = false;
		int a = 5, b = 5;
		
		int expectedSubstraction = 0;
		int actualSubstraction = substraction(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual substration is: "+actualSubstraction+"\nExpected substration is: "+expectedSubstraction);
		
		if(actualSubstraction==expectedSubstraction) {
			System.out.println("Substration of two numbers is correct\n");
			isPass = true;
		} else {
			System.out.println("Substration of two numbers is not correct\n");
		}	
		
		return isPass;
	}
	
	public void assertDivisionTest() {
		int a = 5, b = 5;
		
		int expectedDivision = 2;
		int actualDivision = division(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual division is: "+actualDivision+"\nExpected division is: "+expectedDivision);
		
		if(actualDivision==expectedDivision) {
			System.out.println("Division of two numbers is correct\n");
		} else {
			System.out.println("Division of two numbers is not correct\n");
		}		
	}
	
	public void assertMultiplicationTest() {
		int a = 5, b = 5;
		
		int expectedMultiplication = 20;
		int actualMultiplication = multiplication(a, b);
		
		System.out.println("Value of a is: "+a+" value of b is: "+b);
		System.out.println("Actual multiplication is: "+actualMultiplication+"\nExpected multiplication is: "+expectedMultiplication);
		
		if(actualMultiplication==expectedMultiplication) {
			System.out.println("Multiplication of two numbers is correct\n");
		} else {
			System.out.println("Multiplication of two numbers is not correct\n");
		}		
	}
	
	
}
