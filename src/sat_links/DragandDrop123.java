package sat_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DragandDrop123 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
     WebElement src=		d.findElement(By.id("draggable"));
     WebElement target=		d.findElement(By.id("droppable"));
     
     Actions dd=new Actions(d);
     
     Sleeper.sleepTightInSeconds(3);
     
     dd.dragAndDrop(src, target).build().perform();
		
		

	}

}
