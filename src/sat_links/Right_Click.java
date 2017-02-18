package sat_links;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		
		 WebElement src=d.findElement(By.linkText("Gmail"));
		 
		 Actions rc=new Actions(d);
		 
		// rc.contextClick(src).sendKeys("T").build().perform();
		 
		 // or 
		 
		// rc.contextClick(src).sendKeys(Keys.ARROW_DOWN)
		                   //  .sendKeys(Keys.ARROW_DOWN)
		                    // .click().build().perform();
		 
		 // double click
		 rc.doubleClick(src).perform();
		 
	
	}

}
