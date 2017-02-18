package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath12 {

	public static void main(String[] args) throws Exception{
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");

		Thread.sleep(2000);
		
		d.findElement(By.xpath("html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div/div[3]/div/input[1]")).sendKeys("qtp");
		Thread.sleep(2000);
		d.findElement(By.xpath(".//*[@id='_fZl']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath(".//*[@id='lst-ib']")).clear();
		
	}

}
