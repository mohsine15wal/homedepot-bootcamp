package com.homedepot.homrdepot;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class registration1 extends browsers_codes {
  @Test
  public void registrationFunction() {
		
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
}
