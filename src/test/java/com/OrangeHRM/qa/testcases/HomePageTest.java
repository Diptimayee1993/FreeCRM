package com.OrangeHRM.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHrm.qa.Base.TestBase;
import com.OrangeHrm.qa.pages.AdminPage;
import com.OrangeHrm.qa.pages.DashboardPage;
import com.OrangeHrm.qa.pages.DirectoryPage;
import com.OrangeHrm.qa.pages.HomePage;
import com.OrangeHrm.qa.pages.LoginPage;
import com.OrangeHrm.qa.pages.MyInfoPage;
import com.OrangeHrm.qa.pages.PIMPage;
import com.OrangeHrm.qa.pages.PerformancePage;
import com.OrangeHrm.qa.pages.RecruitmentPage;
import com.OrangeHrm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;// 'loginpage' variable reference we have created & initializing the reference
						// like this 'loginPage = new LoginPage()'..
	HomePage homePage;// define homepage class object
    TestUtil testUtil;
    DashboardPage dashboardPage;
    PerformancePage performancePage;
    DirectoryPage directoryPage;
    RecruitmentPage recruitmentPage;
    AdminPage adminPage;
    PIMPage PimPage;
    MyInfoPage myinfoPage;
	public HomePageTest() {
	super();

	}
	
	//TestCases should be separated---independent with each other
	//Before each test case -----Launch the browser and Login.
	//@Test----Execute Test case.
	//After each test case---close the browser.it doesn't matter how much test cases are there.
	
	

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();// it will "loginPage = new LoginPage();" come inside the setup method & it will
		testUtil = new TestUtil();				// call this" public HomePageTest() constructor so that the property will be  initialize.
		dashboardPage = new DashboardPage();
		performancePage=  new PerformancePage(); 
		directoryPage=new DirectoryPage(); 
		recruitmentPage=new RecruitmentPage();
		adminPage = new AdminPage();
		myinfoPage=new MyInfoPage();
		PimPage= new PIMPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("Password"));
	}

	@Test(priority=1)
	public void HomePageTitleTest() {
		String homePageTitle = homePage.VerifyHomePageTitle();
		Assert.assertEquals(homePageTitle,
				"OrangeHRM" ,"Home Page title not matched");//only when the test case is getting failed then "Home Page title not matched" will be printed. 
	}
	
	@Test(priority=2)
	public void verifyWelcomenameTest() {
		Assert.assertTrue(homePage.VerifyWelcomename());
		
	}
	
	@Test(priority=3)
	public void  clickOnDashboardLinkTest() {
		dashboardPage=homePage.clickOnDashboardLink();	
	}
	
	@Test(priority=4)
	public void  clickOnPerformanceLinkTest() {
		performancePage=homePage.clickOnPerformanceLink();	
	}
	
	@Test(priority=5)
	public void  clickOnDirectoryLinkTest() {
		directoryPage=homePage.clickOnDirectoryLink();	
	}	
	
	@Test(priority=6)
	public void clickOnRecruitmentLinkTest() {
		recruitmentPage= homePage.clickOnRecruitmentLink();
		
	}
	
	@Test(priority=7)
	public void clickOnAdminLinkTest() {
		adminPage=homePage.clickOnAdminLink();
		
	}
	
	@Test(priority=8)
	public void clickOnPIMLinkTest() {
		PimPage=homePage.clickOnPIMLink();
	}
	
	@Test(priority=9)
	public void clickOnMyInfoLink() {
		myinfoPage=homePage.clickOnMyInfoLink();
	}
	
	@Test
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}