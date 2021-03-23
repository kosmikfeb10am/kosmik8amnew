package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowUtils {
	
	
	public static void switchWindow(WebDriver driver,String xpath)
	{
		
		

		Set<String> windowIds=driver.getWindowHandles();
		
		
		Iterator<String> it=windowIds.iterator();
		
		
		while(it.hasNext())
		{
			
			
			driver.switchTo().window(it.next());
			
			try
			{
			driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e)
			{
				
				System.out.println("Not Switched into Expected Window");
			}
			
			
		}
		
		
	}

}
