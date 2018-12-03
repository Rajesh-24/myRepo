package com.jbk.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Setup\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javabykiran.com/");
	}
	
	@Test(priority=1)
	public void pageTitleTest()
	{
		String actaul =driver.getTitle();
		assertEquals(actaul, "Java Classes in Pune | Selenium Training | Python Courses in pune","Title Doesn;t Match");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();		
	}

}
