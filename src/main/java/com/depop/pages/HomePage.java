package com.depop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.depop.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//button[@text='Logout']")
	WebElement logoutTxt;
	
	@FindBy(xpath = "//button[@data-testid='navigation__logout']")
	WebElement logoutBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean verifyLogoutText() {
		try
		{
			driver.findElement(By.xpath("//button[@text='Logout']"));
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	public void clickOnLogoutButton() {
		logoutBtn.click();
	}
	
	public SearchPage searchItem() {
		return new SearchPage();
	}

}
