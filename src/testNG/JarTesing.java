package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JarTesing {

	public static void main(String[] args) {

 System.setProperty("webdriver.chrome.driver", "C:/Users/satt/workspace/JavaPractice/lib/chrome driver/chromedriver.exe" );
 WebDriver driver = new ChromeDriver();
 
 driver.get("http://www.google.com");
 
	}

}
