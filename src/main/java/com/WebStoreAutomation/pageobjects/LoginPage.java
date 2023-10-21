package com.WebStoreAutomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.WebStoreAutomation.actiondriver.Action;
import com.WebStoreAutomation.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailForExistingAccount;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement pwdForExistingAccount;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	WebElement signInBtn;
	
	@FindBy(xpath = "//input[@id='email_create']")///for Account creation
	WebElement emailForNewAccount;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	WebElement createNewAccountBtn;
	
	public HomePage existingUserLogIn(String uname,String password) {
		Action.type(emailForExistingAccount,uname);
		Action.type(pwdForExistingAccount,password );
		Action.click(driver, signInBtn);
		return new HomePage();
	}
	
	public AccountCreationPage createNewAccount(String newEmail) {
		Action.type(emailForNewAccount, newEmail);
		return new AccountCreationPage();
	}
}
