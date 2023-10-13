package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class LoginModule 
{
		private WebDriver d1;
		
		public LoginModule(WebDriver d1)
		{
			this.d1=d1;
			
		}
		
		public void login(String user,String passw)
		{
			d1.switchTo().newWindow(WindowType.TAB);
			d1.navigate().to("https://www.facebook.com/login");
			
			WebElement userinput = d1.findElement(By.name("email"));
			WebElement passinput = d1.findElement(By.name("pass"));
			WebElement loginbutton = d1.findElement(By.name("login"));
			
			userinput.sendKeys(user);
			passinput.sendKeys(passw);
			loginbutton.click();
			
		}
		
}
