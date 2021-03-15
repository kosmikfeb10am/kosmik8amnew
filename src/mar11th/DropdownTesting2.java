package mar11th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utils.UIUtils;

public class DropdownTesting2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//new Select(driver.findElement(By.id("searchDropdownBox"))).selectByIndex(11);
		
		
		/*
		 * new Select(driver.findElement(By.id("searchDropdownBox")))
		 * .selectByValue("search-alias=beauty");
		 */
		
		UIUtils util=new UIUtils();
		
		
		util.dropDownSelection(driver.findElement(By.id("searchDropdownBox")), "Watches");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
