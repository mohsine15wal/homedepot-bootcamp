package com.homedepot.homrdepot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creat_account_page {
	/*driver.findElement(By.name("email")).sendKeys("mohsine@hotmail.com");
	driver.findElement(By.name("password")).sendKeys("nothing");
	driver.findElement(By.name("zipcode")).sendKeys("22102");
	driver.findElement(By.name("phone")).sendKeys("222-222-2222");*/
	
	public  WebDriver driver;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="zipcode")
	 WebElement zipcode;
	 
	@FindBy(name="phone")
	WebElement phone;

	public  Creat_account_page(WebDriver driver){
		
		this.driver=driver;
		
	PageFactory.initElements(driver, this);
	
		}
	public void email(String key) {
		email.sendKeys(key);
	}
	public void password (String key) {
		password.sendKeys(key);
	}
	public void zipcode(String key) {
		zipcode.sendKeys(key);
	}
	public void phone(String key) {
		phone.sendKeys(key);
	}
}
