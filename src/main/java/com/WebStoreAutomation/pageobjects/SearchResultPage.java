package com.WebStoreAutomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebStoreAutomation.actiondriver.Action;
import com.WebStoreAutomation.base.BaseClass;

public class SearchResultPage extends BaseClass{
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement prodResult;
	
	public boolean isProductAvailable() {
		return Action.isDisplayed(driver, prodResult);
	}
	
	public AddToCartPage clickOnProduct() {
		Action.click(driver, prodResult);
		return new AddToCartPage();
	}
	

}
