package mar11th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
			
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@class='desktop-navLink']/a"));
		
		System.out.println("No of Links "+allLinks.size() );
		
		
		for(int i=0;i<allLinks.size();i++)
		{
			
			System.out.println("LinkName "+allLinks.get(i).getText());
			
			System.out.println("Expected URL "+allLinks.get(i).getAttribute("href"));
			
			allLinks.get(i).click();
			
			Thread.sleep(3000);
			
			System.out.println("Actual URL"+driver.getCurrentUrl());
			
			driver.navigate().back();
					
			
			allLinks=driver.findElements(By.xpath("//div[@class='desktop-navLink']/a"));
			
			
		}
		
		
		
		
		
		
		
		

	}

}
