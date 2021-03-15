package mar12th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeMethod
	public void setUP()
	{
		System.out.println("Browser started ...");
		System.out.println("Application Launched ...");
		System.out.println("Maximized browser ...");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Browser closed...");
		
	}
	@Test(priority=2)
	public void loginTest()
	{
		
		Assert.assertTrue(true, "Login Not successful");
		System.out.println("Login Test Successfull");
		
	}
	
	@Test(priority=1)
	public void registrationTest()
	{
		
		System.out.println("Registration successfull");
		
	}
	
	@Test(priority=3 , dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		
		System.out.println("Chnage password Successfull");
		
	}

}
