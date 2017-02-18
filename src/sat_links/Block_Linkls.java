package sat_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Block_Linkls {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.bing.com/");
		d.manage().window().maximize();
		
		//identify the Block 
		 WebElement block= d.findElement(By.id("sc_hdu"));
		 
		 List<WebElement> links= block.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 
		 
		 for (int i = 0; i < links.size(); i++) 
		 {
			
			String str= links.get(i).getText();
			 System.out.println(str);
		}
	
	}

}

