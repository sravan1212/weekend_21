package sat_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class SLider {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/slider/#slider-vertical");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
	//identify the Slider element
		WebElement slider=d.findElement(By.xpath("html/body/div/span"));
		
		
		int y= slider.getLocation().y;
		int x= slider.getLocation().x;
		
		Actions obj=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		obj.dragAndDropBy(slider, 60, y).build().perform();
		
	

	}

}
