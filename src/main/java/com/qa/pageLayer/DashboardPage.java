package com.qa.pageLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class DashboardPage extends TestBase {

	public DashboardPage()
	{

		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_box;

	public void EnterCompanyName (String comname) throws InterruptedException
	{

		search_box.sendKeys(comname);
		Thread.sleep(2000);
	}
	public void clickOnSbi()
	{
		driver.findElement(By.partialLinkText("SBI")).click();
	}

	public void clickOnAxis()
	{
		driver.findElement(By.partialLinkText("AXIS")).click();
	}
}
