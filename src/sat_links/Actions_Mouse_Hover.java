package sat_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Actions_Mouse_Hover {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com/in/English/");
		d.manage().window().maximize();
		
		WebElement src= d.findElement(By.xpath(".//*[@id='trips']/a"));
		
		WebElement src12= d.findElement(By.xpath(".//*[@id='book']/a"));
		
		Sleeper.sleepTightInSeconds(2);
		
		Actions mo=new Actions(d);
		
		mo.moveToElement(src).moveToElement(src12).build().perform();
		
		//mo.moveToElement(src12).perform();
		
		

	}

}
