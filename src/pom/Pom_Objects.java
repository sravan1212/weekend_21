package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_Objects {
	
	@FindBy(id="txtUsername")  
	WebElement user;
	
	@FindBy(id="txtPassword")  
	WebElement pass;
	
	@FindBy(id="btnLogin")  
	WebElement loginbtn;
	
	
	public void login(String username,String passsd)
	{
		user.sendKeys(username);
		pass.sendKeys(passsd);
		loginbtn.click();
	}

}
