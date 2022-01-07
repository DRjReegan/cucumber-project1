package com.Base_Class;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass_Methods {
	public static WebDriver driver;
	public static String value;
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe" );
			 driver = new ChromeDriver();}
	
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
		
	}
	
	public static String ParticularData(String path,int row,int column) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row1 = sheetAt.getRow(row);
		Cell cell = row1.getCell(column);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			 value = cell.getStringCellValue();
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double cellvalue = cell.getNumericCellValue();
			long val_u = (long) cellvalue;
			value = String.valueOf(val_u);
			
		}
		wb.close();
		return value;
	}

	
	
	public static void url(String url) {
			driver.get(url);	
	
	}

	public static void clickonElement(WebElement element) {
		element.click();
	}
	public static void InputValueElement(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	public static void close(Object close){
		driver.close();
	}	
	//Actions a = new Actions(driver);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
