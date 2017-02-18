package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid1 {
	
	@Test
	public void sample() throws MalformedURLException, Exception 
	{
		DesiredCapabilities cap=null;
		
		
		cap=DesiredCapabilities.chrome();
	
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		
		
		
		RemoteWebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		d.get("http://google.com");
		d.manage().window().maximize();
		
			
	}

}
