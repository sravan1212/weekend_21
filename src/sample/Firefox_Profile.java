package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_Profile {

	public static void main(String[] args) {
		
		
		
		//Create Profile Obj
		ProfilesIni pr=new ProfilesIni();
		
		//Create fierefox Profile Obj
		  FirefoxProfile fp= pr.getProfile("weekend21");
		  
		  WebDriver driver=new FirefoxDriver(fp);
		  driver.get("http://fb.com");

	}

}



