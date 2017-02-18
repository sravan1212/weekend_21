package Sunday5;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeMethod;

public class DynamicXpath_Ajax {
  @Test
  public void f() {
	  WebDriver d=new FirefoxDriver();
		d.get("https://in.yahoo.com/?p=us");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
	  
		d.findElement(By.id("UHSearchBox")).sendKeys("selenium");
		
	List<WebElement> links=	d.findElements(By.xpath("//*[starts-with(@id,'yui_3_12_0_3_14862')]/a"));
	  System.out.println(links.size());
	  
	  Sleeper.sleepTightInSeconds(3);
	  
	  links.get(0).click();
	  
  }
  
  
}
