package mar4th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("New User Register Here")).click();
		
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).clear();
		
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
