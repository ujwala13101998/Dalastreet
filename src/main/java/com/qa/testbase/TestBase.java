package com.qa.testbase;

import java.time.Duration;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.Loginpage;
import com.qa.utility.UtilClass;
import com.qa.utility.Util_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Actions action;
	public static DashboardPage dash;
	public static UtilClass util;
	public static Util_Class utility;
	public  static Logger logger;


	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("DalalStreet Automation Testing Framework");
		PropertyConfigurator.configure("Log4j.properties");

	}

	@AfterClass
	public void end()
	{
		logger.info("Test execution completed");
	}

	@BeforeMethod
	@Parameters ("Browser")

	public void setUp(String br)
	{

		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please enter correct browser name from 'Chrome', 'Firefox' and 'Edge'");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



		Loginpage login = new Loginpage();
		login.enterEmailID("ujwala.wakchaure13@gmail.com");
		login.enterPassword("ujawak13");
		login.clickOnLogin();

		action = new Actions(driver);
		dash = new DashboardPage();
		util = new UtilClass();
		utility =new Util_Class();

	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("browser closed");

	}
}








