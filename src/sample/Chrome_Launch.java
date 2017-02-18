package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;








public class Chrome_Launch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		
		ChromeDriver d=new ChromeDriver();
		d.get("http://google.com");
		

	}

}



