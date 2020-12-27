package com.homedepot.homrdepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class homedepotNewTest {
	
	private static WebDriver driver;
 	
	static String dir = System.getProperty("user.dir");
  @Test
  public void functions() {
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	  Homepage hp =new Homepage(driver);
			hp.myAccount();
			hp.register();
			
		
		Acount_type_page Atp= new Acount_type_page(driver);
			Atp.selectcontnue();
		
		Creat_account_page Cap=new Creat_account_page(driver);
			Cap.email("mohsine@hotmail.com");
			Cap.password("Nothing");
			Cap.zipcode("22222");
			Cap.phone("222-222-2222");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
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
  public void afterClass() {
  }

}
