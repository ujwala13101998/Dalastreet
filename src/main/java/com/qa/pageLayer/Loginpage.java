package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class Loginpage extends TestBase{
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='email']")
	private WebElement email;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//button[contains(text(),'Log In')]")
	private WebElement login_btn;

	public void enterEmailID(String e)
	{
		email.sendKeys(e);
	}

	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}

	public void clickOnLogin()
	{
		login_btn.click();
	}



}
