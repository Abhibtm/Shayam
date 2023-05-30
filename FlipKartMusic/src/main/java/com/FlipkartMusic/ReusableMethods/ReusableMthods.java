package com.FlipkartMusic.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReusableMthods {
	public String propetyFetch(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/ActiLogin.PROPERTIES");
		
		Properties pobj = new Properties();
		
		pobj.load(fis);
		
		String data= pobj.getProperty(key);
		
		return data;
		
	}
	
	public String excelFetch(String sheet,int row,int cell) throws Throwable
	{
		DataFormatter df = new DataFormatter();
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		 String data=df.formatCellValue(book.getSheet(sheet).getRow(row).getCell(cell));
		 
		 return data;
	}
	
	
	
	
	
	
	
	
	

}
