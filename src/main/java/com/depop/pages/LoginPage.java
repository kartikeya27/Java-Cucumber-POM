package com.depop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.depop.util.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory OR
//	@FindBy(className = ".styles__DepopLogo-h3rhzv-2")
//	WebElement depopLogo;
	
	@FindBy(linkText = "Login")
	WebElement linkTxt;
	
	@FindBy(name = "username")
	WebElement  username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@data-testid='login__cta']")
	WebElement loginBtn;
	
	//Initializing the Page Object:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
//	public Boolean validateDepopLogo() {
//		return depopLogo.isDisplayed();
//	}
	
	public void clickOnLoginLink() {
		linkTxt.click();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	public void clickOnLoginButton() {
		loginBtn.click();
	}
}
