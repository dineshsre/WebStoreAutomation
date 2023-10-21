package com.WebStoreAutomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.WebStoreAutomation.actiondriver.Action;
import com.WebStoreAutomation.base.BaseClass;

public class IndexPage extends BaseClass{
	//Using Page factory for locators
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	WebElement signInBtn;
	
	@FindBy(xpath = "//img[@alt='My Shop']")
	WebElement mystoreLogo;
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchProductBox;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchButton;
	//constructor to initilize elements
	public IndexPage() {
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage clickOnSignIn() {
		Action.click(driver, signInBtn);
		return new LoginPage();
		
	}
	
	public boolean validateLogo() {
		
		return Action.isDisplayed(driver, mystoreLogo);
		
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void searchProduct(String ProductName) {
		Action.type(searchProductBox,ProductName);
		Action.click(driver, searchProductBox);
	}
	

}
