package com.depop.stepDefinitions;

import org.openqa.selenium.By;
import com.depop.pages.HomePage;
import com.depop.pages.LoginPage;
import com.depop.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser()  {
		TestBase.initialization();
	}
	
	@Then("^user clicks on login link$")
	public void user_clicks_on_login_link() {
		loginPage = new LoginPage();
		loginPage.clickOnLoginLink();
	}

	@Then("^user enters wrong \"(.*)\" and \"(.*)\"$")  
	public void user_enters_wrong_username_and_password(String username, String password)  {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^verify error message$")
	public void verify_error_message() {
		loginPage.verifyErrorMessage();
	}
	
	@Then("^user login into app$")
	public void user_login_into_app() {
	    homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^home page is displayed$")
	public void home_page_is_displayed() throws InterruptedException {
	    homePage.verifyLogoutText();
	}
	
	@Then("^user clicks on logout$")
	public void user_clicks_on_logout() {
		homePage.clickOnLogoutButton();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		TestBase.terminate();
	}
}
