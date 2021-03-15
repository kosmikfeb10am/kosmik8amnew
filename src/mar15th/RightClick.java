package mar15th;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RightClick {
	
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
	public void rightClickTest() throws InterruptedException, AWTException
	{
		
				
		Actions action=new Actions(driver);
		
		action.contextClick(driver.findElement(By.xpath("//img[@alt='Hotel Image 3']")))
		.perform();
		
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(5000);
		
		
		
		
		
	}

}
