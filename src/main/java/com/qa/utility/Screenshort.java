package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class Screenshort extends TestBase {
   public Screenshort ()
   {
	   PageFactory.initElements(driver,this);
   }
	
	    static String path ="C:\\Users\\Ujwala\\Downloads\\DemoBlazeProject12FebV1\\DemoBlazeProject12FebV1\\Screenshot";
	    		
	public static void takescreenshot(String filename)  
	{
	 try   		
	{
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File src= ts.getScreenshotAs(OutputType.FILE);
		 
		 File des =new File(path+filename+System.currentTimeMillis()+".png");
		 FileHandler.copy(src, des);
	
	}  		
	 catch (IOException e)
	 {
		 System.out.println("Please provide correct path.");
		 e.printStackTrace();
	 }
	    		
	}    		
	    		
}
