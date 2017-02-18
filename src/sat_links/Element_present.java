package sat_links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_present {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com/");
		d.manage().window().maximize();
		
		//get webpage source
	String src=	d.getPageSource();
	System.out.println(src);
	
	if(src.contains("India"))
	{
		System.out.println("element present");
	}
	else
	{
		System.out.println("element not present");
	}
	
	
	
	
	
	

	}

}
