package sat_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DropDown_Element_Working {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("REGISTER")).click();
		
		WebElement drop= d.findElement(By.name("country"));
		
		List<WebElement> items= drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) 
		{
			 String itemName= items.get(i).getText();
			
			 items.get(i).click();
			
			 
			if(items.get(i).isSelected())
			{
				System.out.println("element is working===="+itemName);
			}
			else
			{
				System.out.println("element is not working====="+itemName);
			}
		}
		
	
	}

}
