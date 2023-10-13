package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpModule 
{
	private WebDriver d1;
	
	public SignUpModule(WebDriver d1)
	{
		this.d1=d1;
	}

	public void singup() throws InterruptedException
	{
		d1.findElement(By.linkText("Create new account")).click();
		
		
		d1.findElement(By.name("firstname")).sendKeys("Avani");
		
		d1.findElement(By.name("lastname")).sendKeys("shinde");
		
		
		d1.findElement(By.name("reg_email__")).sendKeys("sonwanepooja888@gmail.com");
		
		
		d1.findElement(By.name("reg_email_confirmation__")).sendKeys("sonwanepooja888@gmail.com");
		

		d1.findElement(By.name("reg_passwd__")).sendKeys("A#xyz@123");
		
	
		WebElement day = d1.findElement(By.id("day"));
		
		Select s = new Select(day);
		s.selectByVisibleText("15");

		WebElement month = d1.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		
		s1.selectByIndex(4);
		
		WebElement year = d1.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		
		s2.selectByValue("2002");
		
		Thread.sleep(3000);
		
		
		d1.findElement(By.xpath("//input[@value=\"1\"]")).click();
		
		
		d1.findElement(By.name("websubmit")).click();
		
		Thread.sleep(4000);
		
	}
}
