package saturday_11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_Mouse {
  @Test
  public void f() throws AWTException {
	  
	  FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
	  
	  
	  Robot robo=new Robot();
	  
	  robo.delay(2000);
	  
	  System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
	  
	  robo.mouseMove(400, 110);
	  
	  
	  robo.delay(3000);
	  
	  robo.mousePress(InputEvent.BUTTON1_MASK);
	  robo.mouseRelease(InputEvent.BUTTON1_MASK);
	 
	  
	  robo.delay(3000);
	  
	  
	  
  }
}
