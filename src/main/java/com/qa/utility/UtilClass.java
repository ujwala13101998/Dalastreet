package com.qa.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class UtilClass extends TestBase {
	public UtilClass () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement Buy_btn;

	public void clickOnBuybtn ()
	{
		Buy_btn.click();
	}


	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement Quantity;

	public void EnterQuantity(int s)
	{
		Quantity.sendKeys(String.valueOf(s));
	}

	@FindBy(xpath="//button[ contains(text(),'Buy')]")
	private WebElement buybtn;

	public void clickOnbuybtn ()
	{
		buybtn.click();
	}

	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status;

	public String StatusOfShareBuying () 
	{
		String s= status.getText();
		return s;
	}


}
















