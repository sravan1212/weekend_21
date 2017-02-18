package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Creation_Xpath {
	 WebDriver d;
	
	@Test
  public void f() {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
	  d.findElement(By.
			  xpath("//div[@class='nav-search-field']/input[@id='twotabsearchtextbox']")).sendKeys("java");
  }
  
  
  

}
