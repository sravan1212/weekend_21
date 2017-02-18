package sat_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Links_all {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.hdfcbank.com/");
		d.manage().window().maximize();
		
	   List<WebElement>  links	= d.findElements(By.tagName("a"));
		System.out.println(links.size());
		
	
		for (int i = 0; i < links.size(); i++) 
		{
			
		String str=	links.get(i).getText();
		System.out.println(str);
		
		}
		
		
		

	}

}
