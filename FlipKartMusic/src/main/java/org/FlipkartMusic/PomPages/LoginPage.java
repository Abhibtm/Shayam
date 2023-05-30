package org.FlipkartMusic.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (id = "username")
	private WebElement un;
	
	@FindBy (name="pwd")
	private WebElement pw;
	
	@FindBy (id = "keepLoggedInCheckBox")
	private WebElement checkBox;
	
	@FindBy (xpath = "//div[text()='Login ']")
	private WebElement login;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPwd;
	
	@FindBy (className = "errormsg")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
        PageFactory.initElements(driver,this);
	}

	public WebElement getUn() {
		return un;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgotPwd() {
		return forgotPwd;
	}

	public WebElement getErrMsg() {
		return errMsg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
