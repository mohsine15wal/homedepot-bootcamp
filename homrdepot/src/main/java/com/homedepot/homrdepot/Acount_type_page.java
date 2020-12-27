package com.homedepot.homrdepot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acount_type_page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[text()=\"Select & Continue\"]")
	WebElement selectcontnue;
	
	
	public  Acount_type_page(WebDriver driver){
	
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
	
		}
		public void  selectcontnue() {
			selectcontnue.click();
		}
}
	
	

	

