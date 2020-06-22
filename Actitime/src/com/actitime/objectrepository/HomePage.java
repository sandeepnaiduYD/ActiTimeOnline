package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
   @FindBy(id="logoutLink")
   private WebElement LUBTN;
  

@FindBy(id="container_tasks")
   private WebElement Tasks;
   public HomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public WebElement getLUBTN() 
   {
		return LUBTN;
	}

	public WebElement getTasks() 
	{
		return Tasks;
	}
   
}
