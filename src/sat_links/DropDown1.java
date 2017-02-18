package sat_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown1 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		
		//identify the  drop down element
		WebElement drop= d.findElement(By.id("searchDropdownBox"));
		
		//from dropdown identify the no.of elements
		List<WebElement> linkssss= drop.findElements(By.tagName("option"));
		System.out.println(linkssss.size());
		
		for (int i = 0; i < linkssss.size(); i++) 
		{
			System.out.println(linkssss.get(i).getText());
		}
		
	
	}

}
