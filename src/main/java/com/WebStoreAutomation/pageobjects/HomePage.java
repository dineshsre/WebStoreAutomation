package com.WebStoreAutomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebStoreAutomation.actiondriver.Action;
import com.WebStoreAutomation.base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Order history and details']")
	WebElement orderHistory;
	
	@FindBy(xpath = "//span[normalize-space()='My addresses']")
	WebElement myAddress;
	
	public Boolean validateOrderHistory() {
		return Action.isDisplayed(driver, orderHistory);
	}
	
	public Boolean validateMyAddress() {
		return Action.isDisplayed(driver, myAddress);
	}
	

}
