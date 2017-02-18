package Sunday5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Tours_Popup {
	
	@Test
	public void popup() throws Exception
	{
	
	
		FirefoxDriver	driver=new FirefoxDriver();
		driver.get("http://www.saiservice.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//it returns unique id of current window
		String str=driver.getWindowHandle();
		System.out.println(str);
		
		
	
	
		//click on Hyderabad link
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div[2]/ul/li[4]/a"))
		                              .click();
		
		
		
		//get multiple window unique ids
	Set<String> str1=driver.getWindowHandles();
	System.out.println(str1);

	Thread.sleep(2000);
	
	// stores the multiple unique ids  into array object
       Object s[]= str1.toArray();
	
	//store the string of the object value
	String winName= s[1].toString();
	

	//switch main window to popup window
    driver.switchTo().window(winName);

Thread.sleep(7000);

// enter user name in popup window
driver.findElement(By.id("Nombre")).sendKeys("hello how r u");

Thread.sleep(4000);

//close popup window
driver.close();


//switch popup window to main window
driver.switchTo().window(s[0].toString());
Thread.sleep(2000);

//click on contact us link in main window
driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[1]/div[3]/div[3]/a")).
                                                             click();

	}
}






