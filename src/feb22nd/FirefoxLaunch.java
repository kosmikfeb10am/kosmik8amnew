package feb22nd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Batches\\olddrivers\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		
	}

}
