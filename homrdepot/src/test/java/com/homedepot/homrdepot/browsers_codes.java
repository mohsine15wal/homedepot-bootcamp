package com.homedepot.homrdepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.tools.ant.property.GetProperty;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class browsers_codes {
	
	public WebDriver driver;
 	
 	static String dir = System.getProperty("user.dir");
 	
 	@Parameters({"browser","site"})
	 	@BeforeClass
	
	 	public void beforeClass( ) {
	 		
	 		String browser= "Chrome";
	 		String url = "https://www.expedia.com/";
	 
		 	 if(browser.equalsIgnoreCase("chrome") ) {
		  
		 		 System.setProperty("webdriver.chrome.driver",dir+"/drivers/chromedriver.exe");
		 		driver= new ChromeDriver();
		 		driver.get(url);
		 		driver.manage().window().maximize();
			
		 	 } else if (browser.equalsIgnoreCase("Firefox")){
		 		
		 		 System.setProperty("webdriver.gecko.driver", dir+"/drivers/geckodriver.exe");
				 driver=new FirefoxDriver();
				 driver.get(url);
				 driver.manage().window().maximize();
			 }
	  }
	
	  @AfterClass
	  public void afterClass() throws InterruptedException {
		 Thread.sleep(8000);
		  driver.close();
		  driver.quit();
	  }
	
	}

	