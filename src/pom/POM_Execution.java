package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_Execution {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		
		Pom_Objects obj= PageFactory.initElements(d, Pom_Objects.class);
		obj.login("Admin", "admin");
	  
  }
}
