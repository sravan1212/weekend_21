package saturday_11;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassDemo{

	public static void main(String[] args) throws InterruptedException, AWTException {
		FirefoxDriver ff=new FirefoxDriver();
		
	    ff.manage().window().maximize();
	    
		//opening allpication
		
		ff.get("http://professional.demo.orangehrmlive.com");
		
		//login
		
		ff.findElement(By.name("txtUsername")).sendKeys("Admin");
		ff.findElement(By.name("txtPassword")).sendKeys("admin");
		ff.findElement(By.name("Submit")).click();
		
		Thread.sleep(2000);
		
		ff.findElement(By.linkText("PIM")).click();
		ff.findElement(By.linkText("Add Employee")).click();
		
		//filling employee details
	
		ff.findElement(By.name("firstName")).sendKeys("Kumar");
		ff.findElement(By.name("lastName")).sendKeys("Wasantha");
		
		
		
	    StringSelection path=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
	    
	   
		ff.findElement(By.name("photofile")).click();
		
		Robot robot = new Robot();
		Thread.sleep(1000);
		//Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		
		 
		  // Press CTRL+V
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);		 
		// Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);	 
		 robot.delay(2000);		        
		//Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		// robot.keyPress(KeyEvent.VK_ENTER);
		 //robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 //ff.findElement(By.id("location")).sendKeys("Texas R&D");
		// ff.findElement(By.id("btnSave")).click();
		 
		 
		
		 
		 


		
		
		
		

	}

}
