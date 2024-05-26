package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.baseClass.baseClass;
import com.inetbanking.pageObjects.addCustomerPage;
import com.inetbanking.pageObjects.loginPage;

public class TC002_addCustomer extends baseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		loginPage lp=new loginPage(driver);
		lp.setUsername(userName);
		logger.info("User name is provided");
		lp.setPassword(passWord);
		logger.info("Passsword is provided");
		lp.clickLogin();
		
		Thread.sleep(3000);
		
		addCustomerPage addcust=new addCustomerPage(driver);
		addcust.clickNewCustomer();
		logger.info("providing customer details....");
		addcust.customerName("Pratik");
		addcust.customerGender("male");
		addcust.customerDob("04", "01", "1999");
		Thread.sleep(3000);
		addcust.customerAddress("India");
		addcust.customerCity("PLO");
		addcust.customerState("MH");
		addcust.customerPinNo("442302");
		addcust.customerTelephoneNo("1234567890");
		String email=randomstring()+"@gmail.com";
		addcust.customerEmailDd(email);
		addcust.customerPassword("dacjdc");
		addcust.submitButton();
		Thread.sleep(3000);
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
}
