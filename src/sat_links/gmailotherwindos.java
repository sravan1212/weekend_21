package sat_links;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class gmailotherwindos {
	  @Test
	  public void f() throws InterruptedException {
		  WebDriver d = new FirefoxDriver();
		  
		  d.get("https://www.google.co.in/");
		  d.manage().window().maximize();
		  String str = d.getWindowHandle();
		  System.out.println(str);
		  
		WebElement gmail =   d.findElement(By.linkText("Gmail"));
		  Actions cur = new Actions(d);
		  cur.contextClick(gmail).sendKeys("T").build().perform();
		  Thread.sleep(3);
		  
		  Set<String> str1=d.getWindowHandles();
			System.out.println(str1);
			
			
		/*  Object s[] = str1.toArray();
		  String main = s[0].toString();
		  System.out.println(main);
		  String child = s[1].toString();
		  */
		  
		  
		  
		  
		  
	  }
	}
