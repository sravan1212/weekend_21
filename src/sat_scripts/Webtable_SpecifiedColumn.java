package sat_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_SpecifiedColumn {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		
		//"html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[1]/td[5]
		
		
		/*String path1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		 String path2="]/td[5]";
		
		for (int i = 1; i < 36; i++) 
		{
		String str=	d.findElement(By.xpath(path1+i+path2)).getText();
			System.out.println(str);
		}
		
		
		*/
		
		
		d.findElement(By.xpath("html/body/div[1]/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("sdfdsfsdfds");
		
		
		
		
		
		

	}

}
