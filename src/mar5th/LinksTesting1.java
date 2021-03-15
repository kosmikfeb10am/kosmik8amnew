package mar5th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//to launch application using URL
		
		driver.get("http://adactinhotelapp.com/");
		
		String expURL=driver.findElement(By.linkText("New User Register Here")).getAttribute("href");
		
		System.out.println("expURL"+expURL);
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getLocation().getX());
		

		System.out.println(driver.findElement(By.linkText("New User Register Here")).getLocation().getY());
		
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getRect().height);
		
		
		System.out.println(driver.findElement(By.linkText("New User Register Here")).getRect().width);
		//font-family
		System.out.println(driver.findElement(By.
				linkText("New User Register Here")).
				getCssValue("color"));
		
		System.out.println(driver.findElement(By.xpath("//td[text()='Important Note:']"))
				.getCssValue("color"));
		driver.findElement(By.linkText("New User Register Here")).click();
		
		
		System.out.println(driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr[3]/td/a")).getText());
		String actURL=driver.getCurrentUrl();
		
		System.out.println("actURL"+actURL);
		
		driver.quit();

	}

}
