package com.OrangeHRM.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrm.qa.Base.TestBase;
import com.OrangeHrm.qa.pages.HomePage;
import com.OrangeHrm.qa.pages.LoginPage;
import com.OrangeHrm.qa.pages.MyInfoPage;
import com.OrangeHrm.qa.util.TestUtil;

public class MyInfoPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	MyInfoPage myinfoPage;
	TestUtil testUtil;
	
	public MyInfoPageTest() {
		super();

}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();// it will "loginPage = new LoginPage();" come inside the setup method & it will
		testUtil = new TestUtil(); // call this" public HomePageTest() constructor so that the property will be
									// initialize.
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("Password"));
		homePage.clickOnMyInfoLink();
		myinfoPage=homePage.clickOnMyInfoLink();
		
	}	
	
	
	@Test
	public void validateCreateMyInfo() throws InterruptedException {
		homePage.clickOnMyInfoLink();
		
		myinfoPage.createMyInfo("Married", "Paul", "Kumar", "Collings", "0024");
		Thread.sleep(5000);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}