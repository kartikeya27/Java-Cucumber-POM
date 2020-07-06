package com.depop.pages;

import org.openqa.selenium.support.PageFactory;

import com.depop.util.TestBase;

public class SearchPage extends TestBase {
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

}
