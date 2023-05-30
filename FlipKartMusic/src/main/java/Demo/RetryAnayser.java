package Demo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnayser implements IRetryAnalyzer {

	int count=0;
	int maxtry=3;
	@Override
	public boolean retry(ITestResult result) {
		
	   if(count<=maxtry)
	   {
		   count++;
		   return true;
	   }
	return false;
	
	}

}
