package feb23rd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//to launch application using URL
		
		driver.get("http://adactinhotelapp.com/");
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getWindowHandle());
		
		
		
		Thread.sleep(5000);
		
		//this will close the tab or browser
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/table[2]/tbody/tr/td[2]/a/img")).click();
		
		Thread.sleep(5000);
		
		//driver.close();
		
		driver.quit();
		
		
	}

}
