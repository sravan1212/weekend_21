package saturday_11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Robot_SaveFile {
  @Test
  public void f() throws AWTException {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.linkText("3.0.1")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		
		robo.delay(2000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
	  
	  
	  
  }
}
