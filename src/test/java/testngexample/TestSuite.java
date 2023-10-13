package testngexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import example.LoginModule;
import example.SignUpModule;

public class TestSuite 
{
	
	private WebDriver d1;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		d1= new ChromeDriver();
		
		d1.navigate().to("https://www.facebook.com/");
		
		d1.manage().window().maximize();
		
		d1.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Navigate successfully on Facebook page");
	}
	
	@Test
	public void testSignUp() throws InterruptedException
	{
		SignUpModule signupmodule = new SignUpModule(d1);
		signupmodule.singup();
		
		System.out.println("SignUp Successfull");
	}
	
	@Test(dependsOnMethods = "testSignUp")
	public void testLogin()
	{
		LoginModule loginmodule = new LoginModule(d1);
		loginmodule.login("Admin","admin123");
		
		System.out.println("Login Successfull");
	}
	
	@AfterSuite
	public void exit()
	{
		d1.quit();
		
		System.out.println("Test Completed");
	}

}
