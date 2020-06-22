package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement UNTBX;
	@FindBy(name="pwd")
	private WebElement PWTBX;
	@FindBy (xpath="//div[.='Login ']")
	private WebElement LBTN;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Business logic
    public void setLogin(String un,String pwd)
    {
    	UNTBX.sendKeys(un);
    	PWTBX.sendKeys(pwd);
    	LBTN.click();
    }

}
