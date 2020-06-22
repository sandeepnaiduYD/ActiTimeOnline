package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;

	public FileLib f= new FileLib();

	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		String url = f.getpropertyvalue("url");
		String un = f.getpropertyvalue("username");
		String pwd = f.getpropertyvalue("password");
		driver.get(url);
		LoginPage l= new LoginPage(driver);
		l.setLogin(un, pwd);
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		Thread.sleep(5000);
		h.getLUBTN().click();
	}
	@AfterClass
	public void closeBrowser()
	{
	 driver.close();	
	}
}
