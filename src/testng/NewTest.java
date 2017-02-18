package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  
	@Test
  public void f() {
		System.out.println("FIRST");
		
  }
	@Test
	public void a()
	{
		System.out.println("last");
	}
	
	@Test
	public void b()
	{
		System.out.println("lauiiuist");
	}
	
	@Test
	public void c()
	{
		System.out.println("lasteeeeeee");
	}
 
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("SECOND");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("THIRD");
  }

}
