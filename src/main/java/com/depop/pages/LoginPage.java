package com.depop.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.depop.util.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(linkText = "Login")
	WebElement linkTxt;
	
	@FindBy(name = "username")
	WebElement  username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@data-testid='login__cta']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@data-testid='login__error--server']")
	WebElement errorMsg;
	
	//Initializing the Page Object:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginLink() {
		linkTxt.click();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
	public void verifyErrorMessage() {
		String error = errorMsg.getText();
		assertEquals("Invalid username or password. Please try again", error);
	}
}
