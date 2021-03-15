package mar11th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of Links "+allLinks.size() );
		
		
		for(int i=0;i<allLinks.size();i++)
		{
			
			System.out.println("LinkName "+allLinks.get(i).getText());
			
			System.out.println("Expected URL "+allLinks.get(i).getAttribute("href"));
			
			allLinks.get(i).click();
			
			Thread.sleep(3000);
			
			System.out.println("Actual URL"+driver.getCurrentUrl());
			
			driver.navigate().back();
			
			
			block=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
			
			
			allLinks=block.findElements(By.tagName("a"));
			
		}
		
		
		
		
		
		
		
		

	}

}
