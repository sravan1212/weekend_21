package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Launch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "E:/IEDriverServer.exe");
		
		WebDriver d=new InternetExplorerDriver();
		d.get("http://fb.com");
		

	}

}
