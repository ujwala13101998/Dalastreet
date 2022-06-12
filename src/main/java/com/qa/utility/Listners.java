package com.qa.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution started "+result.getName());
	}


	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Test passed "+result.getName());

	}


	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed "+result.getName());
		Screenshort.takescreenshot(result.getName());
		System.out.println("Takes screenshot.");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped "+result.getName());


	}



}







