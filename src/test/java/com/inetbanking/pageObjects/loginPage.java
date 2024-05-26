package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement loginButton;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logoutButton;
	
	public void setUsername(String username) 
	{
		txtUserName.sendKeys(username);
    }
	
	public void setPassword(String password) 
	{
		txtPassword.sendKeys(password);
    }
	
	public void clickLogin() 
	{
		loginButton.click();
    }
	
	public void clickLogout() 
	{
		logoutButton.click();
    }
}
