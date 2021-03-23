package mar23rd;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IciciBank {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
	driver=new ChromeDriver();
	
	driver.get("https://www.icicibank.com/");
	
	driver.manage().window().maximize();
	
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
	}
	
	
	
	@Test
	public void multipleWindowHandleTest1() throws InterruptedException, AWTException
	{
		Thread.sleep(1000000);
		
	}
		

}
