package mar15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateMouseHover {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
	
		driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
		
	}
	
	@Test
	public void validateMouseHoverTest() throws InterruptedException
	{
		Actions action=new Actions(driver);
		
		/*
		 * action .moveToElement(driver .findElement(By
		 * .xpath("//a[text()='Men' and @data-index]"))) .perform();
		 * 
		 * driver.findElement(By.
		 * xpath("//ul[@class='desktop-navBlock']/descendant::a[text()='T-Shirts'  and contains(@href,'men')]"
		 * )).click();
		 */
		
		action
		.moveToElement(driver
		.findElement(By
		.xpath("//a[text()='Men' and @data-index]")))
		.pause(3000)
		.moveToElement(driver
		.findElement(By
		.xpath("//ul[@class='desktop-navBlock']/descendant::a[text()='T-Shirts'  and contains(@href,'men')]")))
		.click()
		.build()
		.perform();
		
				
		
		
		
		Thread.sleep(5000);
		
	}
	
	
	
	

}
