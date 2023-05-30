package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderclass {
	@DataProvider(name = "Star")
	public Object[][] dataPrsent()
	{
		Object[][] x = new Object[2][2];
		
		x[0][0] ="admin";
		x[0][1] ="manager";
		
		x[1][0]="admin1";
		x[1][1]="manager2";
		
		return x;
		
	}
	
	@Test(dataProvider ="Star")
	public void m1(String s,String s1)
	{
		System.out.println(s+"  "+s1);
	}
	
	
	
	
	
	
	

}
