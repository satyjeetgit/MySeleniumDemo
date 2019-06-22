package testNG;

import org.testng.annotations.Test;

public class TestNG_Priority {
	
	//Use priority along with @Test , this will decide the sequence of execution of the test.
	@Test(priority=1)
	public void TestOne()
	{
		System.out.println("Checking priority order 1");
	}
	@Test(priority=3)
	public void TestThree()
	{
		System.out.println("Checking priority order 3");
	}
	@Test(priority=2)
	public void TestTwo()
	{
		System.out.println("Checking priority order 2");
	}
	@Test(priority=4)
	public void TestFour()
	{
		System.out.println("Checking priority order 4");
	}

}
