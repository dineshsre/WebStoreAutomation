package com.WebStoreAutomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebStoreAutomation.actiondriver.Action;
import com.WebStoreAutomation.base.BaseClass;

public class AccountCreationPage extends BaseClass{
	
	@FindBy(xpath = "//h3[normalize-space()='Create an account']")
	WebElement formTitle;
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatePageTitle() {
		return Action.isDisplayed(driver, formTitle);
	}

}
