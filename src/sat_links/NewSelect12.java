package sat_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class NewSelect12 {

	public static void main(String[] args) throws Exception{
		
		WebDriver d=new FirefoxDriver();
		d.get("http://book.spicejet.com/Search.aspx");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		//identify the drop down 
		WebElement drop= d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1"));

		//identify the drop down 
		WebElement drop12= d.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1"));
		
		
		Thread.sleep(2000);
		
		new Select(drop).selectByVisibleText("Goa (GOI)");
		
		Thread.sleep(2000);
		new Select(drop12).selectByVisibleText("Hyderabad (HYD)");
		Thread.sleep(2000);
		new Select(drop12).selectByVisibleText("Bengaluru (BLR)");
		
		
	}

}
