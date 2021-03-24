package mar24th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WaitsDemo {
	
	

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		
			driver.quit();
	}
	
	
	
	@Test
	public void waitsDemoTest() throws InterruptedException
	
	{
		
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		//Thread.sleep(10000);
		
		
	}
		

}
