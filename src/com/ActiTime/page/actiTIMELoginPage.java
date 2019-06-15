package com.ActiTime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiTime.Generic.BasePage;

public class actiTIMELoginPage extends BasePage
{
	@FindBy(id="username")private WebElement unTB;
	@FindBy(name="pwd") private WebElement pwTB;
	@FindBy(xpath="//div[.='Login ']") private WebElement lgBT;
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']") private WebElement error;
	@FindBy(xpath="//nobr[.='actiTIME 2019.3 Pro']")private WebElement version;
	public actiTIMELoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
		
	}
	public void clickOnLOgion()
	{
		lgBT.click();
	}
	public String verifyErrorMSG()
	{
		verifyElement(error);
		String aerror =error.getText();
		return aerror;
	}
	
	public String verifyVersion()
	{
		verifyElement(version);
		String aversion =version.getText();
		return aversion;
	}

}
