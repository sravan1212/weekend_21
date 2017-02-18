package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Frames_Paytm {
  
	@Test
  public void f() {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://paytm.com/");
		//d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		d.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]")).click();
		
		List<WebElement> frames=d.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for (int i = 0; i < frames.size();i++) 
		{
			
			d.switchTo().frame(i);
			
			
			try{
				d.findElement(By.id("input_0")).sendKeys("374637463746");
				d.findElement(By.id("input_1")).sendKeys("374637463746");
				d.findElement(By.className("md-raised md-primary btn-new mt-20 md-button ng-scope md-default-theme")).click();
				
			}catch(Exception e)
			{
				d.switchTo().defaultContent();
				
			}
			
			
		}
		
		
  }
}
