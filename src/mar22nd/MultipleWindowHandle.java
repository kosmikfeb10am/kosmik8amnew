package mar22nd;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.WindowUtils;

public class MultipleWindowHandle {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
	driver=new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com/");
	
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
		
		String homeWindowId=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]/parent::a")).click();
		
		WindowUtils.switchWindow(driver,"//a[text()='See more']");
					
		driver.switchTo().window(homeWindowId);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]/parent::a")).click();
		
		WindowUtils.switchWindow(driver,"//a[text()='Terms of Service']");
		
					
		driver.switchTo().window(homeWindowId);
		
				
		Thread.sleep(10000);
		
		
	}
		

}
