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
public class Tc2 extends BaseClass {
	
	@Test(retryAnalyzer =Demo.RetryAnayser.class)
	public void tc2() throws Throwable
	{
		
        driver.findElement(By.id("ntainer_tasks")).click();
		
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(data);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		
	
	}

}
