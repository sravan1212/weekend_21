package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) throws Exception {
		
		//launch
		
	
		//System.setProperty("webdriver.gecko.driver", 
				    //      "E:\\Weekend_21\\Weekend_Project\\geckodriver.exe");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Login App
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		//Logout App
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		driver.close();
		
		
		
		
		
			
	}

}
