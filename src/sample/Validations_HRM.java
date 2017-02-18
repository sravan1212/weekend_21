package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations_HRM {

	public static void main(String[] args) {
		
		String explog;
		String actlog;
		String exp, act;
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		  exp= "orangehrm";
		
		 act =driver.getTitle();
		System.out.println(act);
		
		if(exp.equals(act))
		{
			System.out.println("Launch Sucessssss");
		}
		else
		{
			System.out.println("Launch not  Sucessssss");
		}
		
		//Login App VAlidation
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		 explog = "Welcome Admin";
		 
		 //identify the Welcom ADmin Link
		 actlog= driver.findElement(By.id("welcome")).getText();
		 
		 System.out.println(actlog);
		
		 
		 if(explog.equalsIgnoreCase(actlog))
			 System.out.println("Login Suceessssssssss");
		 else
			 System.out.println("Login not  Suceessssssssss");
		
	}

}
