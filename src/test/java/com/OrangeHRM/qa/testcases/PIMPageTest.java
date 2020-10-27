package com.OrangeHRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrm.qa.Base.TestBase;
import com.OrangeHrm.qa.pages.HomePage;
import com.OrangeHrm.qa.pages.LoginPage;
import com.OrangeHrm.qa.pages.PIMPage;
import com.OrangeHrm.qa.util.TestUtil;

public class PIMPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	PIMPage pimPage;
	TestUtil testUtil;

	public PIMPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();// it will "loginPage = new LoginPage();" come inside the setup method & it will
		testUtil = new TestUtil(); // call this" public HomePageTest() constructor so that the property will be
									// initialize.
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("Password"));
		homePage.clickOnPIMLink();
		pimPage=homePage.clickOnPIMLink();
	}

	@Test
	public void clickOnPIMLink() throws Exception {
		Thread.sleep(3000);
		pimPage.enterEmpName("EMPName", "Dipti");
		pimPage.enterEmpName("EMPID", "123456");
		pimPage.enterEmpName("SupName", "Swadhin");
		
		Thread.sleep(3000);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
