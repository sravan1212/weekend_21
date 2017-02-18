package desktop;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AutoIt_Upload {
  @Test
  public void f() throws IOException {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("photo")).click();
		
		
		Sleeper.sleepTightInSeconds(4);
		Runtime.getRuntime().exec("E:\\Weekend_21\\Autoit\\fileupload.exe");
		
  }
}
