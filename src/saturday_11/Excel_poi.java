package saturday_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Excel_poi {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("E:\\Weekend_21\\Weekend_Project\\test.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	XSSFSheet	 ws= wb.getSheet("Sheet1");
	
	FirefoxDriver driver=new FirefoxDriver();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  
	  Sleeper.sleepTightInSeconds(2);
	  
		driver.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
		driver.findElement(By.id("btnLogin")).click();
		

	}

}





