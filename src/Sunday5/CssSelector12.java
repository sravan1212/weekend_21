package Sunday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class CssSelector12 {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		
		d.findElement(By.cssSelector("div.nav-search-field>input#twotabsearchtextbox")).sendKeys("javaaa");
		
  }
}
