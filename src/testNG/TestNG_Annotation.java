package testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


class TestNG_Annotation {
	WebDriver driver;
	@BeforeMethod
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/satt/workspace/JavaPractice/lib/chrome driver/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Before method run first time");
	}

	@Test
	public void TypeName()
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hello satyjeet");
		System.out.println("Test Method Called");
	}
	@Test
	public void BrowserTitle()
	{
	driver.getTitle();
		System.out.println("Test 2 Method get called");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
	driver.close();
		System.out.println("After Method called");

	}
}
