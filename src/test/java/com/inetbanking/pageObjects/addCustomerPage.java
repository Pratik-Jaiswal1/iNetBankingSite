package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCustomerPage {
	
	WebDriver driver;
	public addCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	WebElement newCustomerButton;
	
	@FindBy(name="name")
	WebElement customerName;
	
	@FindBy(name="rad1")
	WebElement gender;
	
	@FindBy(name="dob")
	WebElement dateOfBirth;
	
	@FindBy(name="addr")
	WebElement addressField;
	
	@FindBy(name="city")
	WebElement cityField;
	
	@FindBy(name="state")
	WebElement stateField;
	
	@FindBy(name="pinno")
	WebElement pinNoField;

	@FindBy(name="telephoneno")
	WebElement mobileNumberField;
	
	@FindBy(name="emailid")
	WebElement emailIdField;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(name="sub")
	WebElement submitButton;
	
	public void clickNewCustomer()
	{
		newCustomerButton.click();
	}
	
	public void customerName(String cname)
	{
		customerName.sendKeys(cname);
	}
	
	public void customerGender(String cgender)
	{
		gender.click();
	}
	
	public void customerDob(String mm,String dd,String yy) 
	{
		dateOfBirth.sendKeys(mm);
		dateOfBirth.sendKeys(dd);
		dateOfBirth.sendKeys(yy);
	}
	
	public void customerAddress(String caddress) 
	{
		addressField.sendKeys(caddress);
	}

	public void customerCity(String ccity) 
	{
		cityField.sendKeys(ccity);
	}

	public void customerState(String cstate) 
	{
		stateField.sendKeys(cstate);
	}
	
	public void customerPinNo(String cpinno) 
	{
		pinNoField.sendKeys(String.valueOf(cpinno));
	}

	public void customerTelephoneNo(String ctelephoneno) 
	{
		mobileNumberField.sendKeys(ctelephoneno);
	}

	public void customerEmailDd(String cemailid) 
	{
		emailIdField.sendKeys(cemailid);
	}

	public void customerPassword(String cpassword) 
	{
		passwordField.sendKeys(cpassword);
	}

	public void submitButton() 
	{
		submitButton.click();
	}
}






























