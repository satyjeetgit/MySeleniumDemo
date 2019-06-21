package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//Sequence of running TestNG annotation are
//BeforeSuite
//BeforeTest
//BeforeClass
//BeforeMethod
//Test
//AfterMethod
//AfterClass
//AfterTest
//AfterSuite

public class TestNG_allAnnotation {

	@BeforeSuite
	public void Test1BSuite()
	{
		System.out.println("Before Suit annotation run first");
	}
	@BeforeTest
	public void Test3BTest()
	{
		System.out.println("BeforeMethod annotation run Second");
	}
	@BeforeClass
	public void Test2BClass()
	{
		System.out.println("BeforeClass annotation run third");
	}
	@BeforeMethod
	public void Test3BMethod()
	{
		System.out.println("BeforeMethod annotation run Forth");
	}
	@Test
	public void RealTest1()
	{
		System.out.println("I am the First Test Running at Fifth position");
	}
	@Test
	public void RealTest2()
	{
		System.out.println("I am the Second Test Running at Fifth position");
	}
	@AfterMethod
	public void Test6AMethod()
	{
		System.out.println("After Method annotation run Sixth");
	}
	@AfterClass
	public void Test8AClass()
	{
		System.out.println("After Class annotation run Seventh");
	}
	@AfterTest
	public void Test7ATest()
	{
		System.out.println("AfterTest annotation run Eigth");
	}
	@AfterSuite
	public void Test9ASuite()
	{
		System.out.println("After Suit annotation run Nineth");
	}
}
