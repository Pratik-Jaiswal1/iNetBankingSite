package com.inetbanking.testCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.baseClass.baseClass;
import com.inetbanking.pageObjects.loginPage;
import com.inetbanking.utilities.dataProvider;


public class TC001_loginDDT extends baseClass
{
	@Test(dataProvider="loginData", dataProviderClass=dataProvider.class)
	public void loginDDT(String user,String pass)
	{
		logger.info("URL is opened");
		loginPage lp=new loginPage(driver);
		lp.setUsername(user);
		logger.info("Entered Username");
		lp.setPassword(pass);
		logger.info("Entered Password");
		lp.clickLogin();
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent()
	{
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
}
