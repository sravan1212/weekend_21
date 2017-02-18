package desktop;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DownloadFile_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.linkText("3.0.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		Runtime.getRuntime().exec("E:\\Weekend_21\\Autoit\\Savefile.exe");
  }
}
