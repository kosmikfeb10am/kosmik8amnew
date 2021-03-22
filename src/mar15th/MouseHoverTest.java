package mar15th;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHoverTest {
	
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
		
		//driver.quit();
	}
	
	
	
	@Test
	public void mouseHoverTest1() throws InterruptedException, AWTException
	{
		
		
		driver.findElement(By.id("push-modal-close")).click(); // Clicking on the popup button
		Robot robot = new Robot();
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		Thread.sleep(5000);
		
		Actions action=new Actions(driver);
		
		action
		.moveToElement(driver.findElement(By.xpath("//span[text()='Loans']")))
		.pause(2)
		.moveToElement(driver.findElement(By.xpath("//label[text()='Agri and Rural Finance']")))
		.perform();
		
		driver.findElement(By.xpath("//a[text()='Tractor Loan']")).click();
		
		
		
		Thread.sleep(5000);
	}
	
	
	

}
