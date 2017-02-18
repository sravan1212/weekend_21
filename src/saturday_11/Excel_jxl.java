package saturday_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_jxl {
  @Test
  public void f() throws BiffException, IOException {
	  
	  FileInputStream fis=new FileInputStream("E:\\Weekend_21\\Weekend_Project\\testdata.xls");
	  
	  Workbook wb=Workbook.getWorkbook(fis);
	  Sheet ws=wb.getSheet("Sheet1");
	  
	  
	  
	  FirefoxDriver driver=new FirefoxDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  
	  Sleeper.sleepTightInSeconds(2);
	  
		driver.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0, 1).getContents());
		driver.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1, 1).getContents());
		driver.findElement(By.id("btnLogin")).click();
	  
  }
}











