package com.depop.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.depop.util.TestBase;

public class ErrorLoginPage extends TestBase {
	
	@FindBy(xpath = "//button[@data-testid='login__cta']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//span[@data-testid='login__error--server']")
	WebElement errorMsg;
	
	public ErrorLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	
	
	public void verifyErrorMessage() {
		String error = errorMsg.getText();
		/*System.out.println("***");
		System.out.println(error);
		System.out.println("***");*/
		assertEquals("Invalid username or password. Please try again", error);
	}

}
