package com.OrangeHrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrm.qa.Base.TestBase;


public class LoginPage extends TestBase {
	
	//Page Factory-Object Repository(OR)..
	@FindBy(id="txtUsername")
	WebElement Username;
			
	@FindBy(css="svg:nth-child(1) switch:nth-child(1) g:nth-child(1) g:nth-child(17) > image:nth-child(1)")
	WebElement OrangeHRMLogo;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement Submit;
	
	
	//Initializing the page objects:
	//Page Factory is a class provided by Selenium WebDriver to support Page Object Design patterns. In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements. @FindBy: An annotation used in Page Factory to locate and declare web elements using different locators.
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
		
	//Actions: it means different feature which are available on login page.
	public String getLoginPageTitle() { // the 1st feature that i want to verify the title of the page.
		return driver.getTitle();
	}
	
	public boolean validateAmazonLogo() {
		return OrangeHRMLogo.isDisplayed();//isDisplayed is return True/False if the logo is available.so we have mention boolean in method.
	}
	
	public HomePage login(String un,String pwd) throws InterruptedException { //This method is returning home page class object.
		
    Actions action=new Actions(driver);//in action class we just to pass the web driver reference that is "Driver" here.
		
		//for perform on Account&list:
		//action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();//.build and .perform is a method to perform the action.
		
		Thread.sleep(2000);
		
		//for mouse movement on sign in button & click:
        //driver.findElement(By.className("nav-action-inner")).click();
		//Signin.click();
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		Submit.click();
		
		return new HomePage();
		
		
		
		
	}

	
	

}
