package testNG;

import org.testng.annotations.Test;

public class TestNG_Repeat {

	//Use incocationCount to repeat any test case to execute multiple time.
		@Test(invocationCount=10)
		public void TestOne()
		{
			System.out.println("invocationCount to repeat the same testcase for multiple number");
		}
}
