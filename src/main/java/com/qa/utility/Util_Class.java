package com.qa.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class Util_Class extends TestBase {

	public Util_Class ()	
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='nav-link']")
	private WebElement sellbtn;

	public void clickOnSell ()
	{
		sellbtn.click();
	}


	@FindBy(xpath="(//input[@class='form-control form-control'])[1]")
	private WebElement quantity;

	public void EnterQuantity (int u)
	{
		quantity.sendKeys(String.valueOf(u));
	}


	@FindBy(xpath="//button[text()='Sell']")
	private WebElement Sell_btn;

	public void ClickOnSellbtn()
	{
		Sell_btn.click();
	}


	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement Status;

	public String statusOfSell()
	{
		String k = Status.getText();
		return k;
	}

}
