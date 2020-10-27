	package com.OrangeHrm.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.OrangeHrm.qa.Base.TestBase;



public class HomePage extends TestBase {
	
	@FindBy( linkText="Welcome Paul")
	@CacheLookup//this is the annotation which say is that OK it will store that particular user level name in a Cache/Memory.so every time whenever u r interacting with this instead of from the page it will get that element from the Cache. 
	//the performace of script will be improved.Speed of your frame work will be improved.
    WebElement Welcomename;
	
	@FindBy( id="menu_dashboard_index")
    WebElement DashboardLink;
	
	@FindBy(id="menu__Performance")
	WebElement PerformanceLink;
	
	@FindBy(id="menu_directory_viewDirectory")
	WebElement DirectoryLink;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement RecruitmentLink;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement AdminLink;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIMLink;
	
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement MyInfoLink;

	//Initializing the page objects:
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	
   public String VerifyHomePageTitle() {
	   return driver.getTitle();	
   }  
	   
	   public boolean VerifyWelcomename() {
		   return Welcomename.isDisplayed();	
	   
	   
	   
   }
   
   public DashboardPage clickOnDashboardLink() {
	    DashboardLink.click();
	    return new DashboardPage();
	    
	   
   }
 
   public PerformancePage clickOnPerformanceLink() {
	   PerformanceLink.click();
	   return new PerformancePage();
   }
   public DirectoryPage clickOnDirectoryLink() {
	   DirectoryLink.click();
	   return new DirectoryPage();
	   
   }
   
   public RecruitmentPage clickOnRecruitmentLink() {
	   RecruitmentLink.click();
	   return new RecruitmentPage();
   }
   
   public AdminPage clickOnAdminLink() {
	   AdminLink.click();
	   return new AdminPage();
	   
   }
   
   public PIMPage clickOnPIMLink() {
	   PIMLink.click();
	   return new PIMPage();
   
   }   
   
   public MyInfoPage clickOnMyInfoLink() {
	   MyInfoLink.click();
	   return new MyInfoPage();
   }  
   
   
   }
