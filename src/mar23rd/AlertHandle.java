package mar23rd;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandle {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
	driver=new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
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
		
		
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("kosmik");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(5000);
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		
		al.accept();
		
		Thread.sleep(5000);
		
		
	}
		

}
