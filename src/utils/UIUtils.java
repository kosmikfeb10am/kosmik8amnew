package utils;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UIUtils {
	
	public void dropDownSelection(WebElement e,String text)
	{
		
		new Select(e).selectByVisibleText(text);
	}

}
