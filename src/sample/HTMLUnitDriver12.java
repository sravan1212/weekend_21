package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;


public class HTMLUnitDriver12 {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		
		driver.get("http://gmail.com");
		
		System.out.println(driver.getTitle());

	}

}





