package genricLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListnerClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	   Reporter.log("Test Started   -"+result.getName(),true);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	 
		 Reporter.log("Test Excuted   -"+result.getName(),true);

	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getName();
		
	   TakesScreenshot sh = (TakesScreenshot)BaseClass.driver;
	   
	   File src = sh.getScreenshotAs(OutputType.FILE);
	   
	   File dist = new File("./screenShot\\"+methodName+".png");
	   try {
		Files.copy(src,dist);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		 Reporter.log("Test Case Skipped   -"+result.getName(),true);

	
	}

	
	@Override
	public void onStart(ITestContext context) {
	   
		 Reporter.log("Project Started");

	
	}

	@Override
	public void onFinish(ITestContext context) {
	 
		Reporter.log("Project Ended");

	
	}

}
