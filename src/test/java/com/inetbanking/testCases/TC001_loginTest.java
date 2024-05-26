package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.baseClass.baseClass;
import com.inetbanking.pageObjects.loginPage;

public class TC001_loginTest extends baseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		logger.info("URL is opened");
		loginPage login=new loginPage(driver);
		login.setUsername(userName);
		logger.info("Entered Username");
		login.setPassword(passWord);
		logger.info("Entered Password");
		login.clickLogin();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passes");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
}
