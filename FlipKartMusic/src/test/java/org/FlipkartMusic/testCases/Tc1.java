package org.FlipkartMusic.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import genricLib.BaseClass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
@Listeners(genricLib.ListnerClass.class)
public class Tc1 extends BaseClass {
	
	@Test
	public void tc1() throws Throwable
	{
		driver.findElement(By.id("taskSearchControl_field")).sendKeys(rm.excelFetch("Sheet1", 1, 1));
		
	}

}
