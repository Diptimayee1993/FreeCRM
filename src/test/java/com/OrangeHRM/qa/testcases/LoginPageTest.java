package com.OrangeHRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrm.qa.Base.TestBase;
import com.OrangeHrm.qa.pages.HomePage;
import com.OrangeHrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();//it is used to called superclass constructor.then it will come over to inside the "Setup" method then it will come to "initialization();" method.then it will go to 'TestBase class' then it will not give null value. becz my properties are already define in 'TestBase' class.
		
	}

	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();//by this object we can access all the function/methods of 'LogIn page' class. so that we have created this class object.
	}
	
	@Test (priority=1)
	public void LoginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		Assert.assertEquals(title , "OrangeHRM");
	}
	
	
	@Test(priority=2)
	public void OrangeHRMLogoImageTest() {
		boolean flag = loginPage.validateAmazonLogo();
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=3)
	public void loginTest() throws Exception {
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("Password"));
	}
	
		
		
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	
}