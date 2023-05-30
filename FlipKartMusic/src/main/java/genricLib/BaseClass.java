package genricLib;

import java.time.Duration;
import java.util.Random;

import org.FlipkartMusic.PomPages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.FlipkartMusic.ReusableMethods.ReusableMthods;

public class BaseClass {
	public static WebDriver driver;
	public ReusableMthods rm;
	Random r = new Random();
	
	public String data="Star"+r.nextInt(10000);
	
	//@Parameters("browser  ")		
	@BeforeClass(alwaysRun = true)
	public void openApp() throws Throwable
	{
	    
		driver = new ChromeDriver();
	    
	   
		driver.manage().window().maximize();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		rm = new ReusableMthods();
		
		driver.get(rm.propetyFetch("url"));
	
	}
	@BeforeMethod (alwaysRun = true)
	public void login() throws Throwable
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.getUn().sendKeys(rm.propetyFetch("un"));
		lp.getPw().sendKeys(rm.propetyFetch("pw"));
		lp.getLogin().click();
		
		
		
		
		
		
	}
	
	
	
	
	@AfterMethod(alwaysRun = true)
	public void logout() throws Throwable
	{
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
	}
	@AfterClass (alwaysRun = true)
	public void closeApp()
	{
		driver.close();
	}
	
	
	
	
	

}
