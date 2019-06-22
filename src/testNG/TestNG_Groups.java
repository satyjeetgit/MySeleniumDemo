package testNG;

import org.testng.annotations.Test;

public class TestNG_Groups {

	
	//Use groups along @Test divides all the test case in the mentioned groups.
		@Test(priority=1, groups="OLSS")
		public void TestOne()
		{
			System.out.println("Checking priority order 1");
		}
		@Test(priority=3, groups="CDS")
		public void TestThree()
		{
			System.out.println("Checking priority order 3");
		}
		@Test(priority=2, groups="OLSS")
		public void TestTwo()
		{
			System.out.println("Checking priority order 2");
		}
		@Test(priority=4, groups="CDS")
		public void TestFour()
		{
			System.out.println("Checking priority order 4");
		}
		@Test(priority=5, groups="Reporting")
		public void TestFive()
		{
			System.out.println("Checking priority order 5");
		}

}
