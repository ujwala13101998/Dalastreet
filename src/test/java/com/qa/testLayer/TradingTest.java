package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase;

public class TradingTest extends TestBase {
	@Test
	public void buySharesOfAxis() throws InterruptedException  
	{
		Thread.sleep(2000);
		dash.EnterCompanyName("Axis");
		dash.clickOnAxis();
		Thread.sleep(2000);
		util.clickOnBuybtn();
		util.EnterQuantity(1);
		util.clickOnbuybtn();
		Thread.sleep(2000);
		Assert.assertEquals(util.StatusOfShareBuying(), "Order Created successfully");
	}


	@Test
	public void buySharesOfSBI() throws InterruptedException
	{    Thread.sleep(2000);
	dash.EnterCompanyName("SBI");
	dash.clickOnSbi();
	Thread.sleep(2000);
	util.clickOnBuybtn();
	util.EnterQuantity(1);
	util.clickOnbuybtn();
	Thread.sleep(2000);
	Assert.assertEquals(util.StatusOfShareBuying(), "Order Created successfully");
	}


	@Test
	public void SellSharesOfAxis () throws InterruptedException
	{
		Thread.sleep(2000);
		dash.EnterCompanyName("Axis");
		dash.clickOnAxis();
		Thread.sleep(2000);
		utility.clickOnSell();
		utility.EnterQuantity(1);
		utility.ClickOnSellbtn();
		Thread.sleep(2000);
		Assert.assertEquals(utility.statusOfSell(), "Order Created successfully");	 
	}


	@Test
	public void SellSharesOfSbi () throws InterruptedException
	{
		Thread.sleep(2000);
		dash.EnterCompanyName("Sbi");
		dash.clickOnSbi();
		Thread.sleep(2000);
		utility.clickOnSell();
		utility.EnterQuantity(1);
		utility.ClickOnSellbtn();
		Thread.sleep(2000);
		Assert.assertEquals(utility.statusOfSell(), "Order Created successfully");	 
	}
}





