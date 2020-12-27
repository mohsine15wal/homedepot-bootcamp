package com.homedepot.homrdepot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	 
	public   WebDriver driver;
		
		
		
		@FindBy(xpath="//div[@id='headerMyAccountTitle']/div")
		WebElement Myaccount;
		
	//	@FindBy(xpath = "//p[@id='SPSORegister']/a/span")
		@FindBy(xpath= "//span[contains(text(),'Register')]")
		WebElement register;
		
		public  Homepage(WebDriver driver){
			
			this.driver=driver;
			
		PageFactory.initElements(driver, this);
		
			}
		public void myAccount() {
			Myaccount.click();
					}
		public void register() {
			register.click();
		}
}
