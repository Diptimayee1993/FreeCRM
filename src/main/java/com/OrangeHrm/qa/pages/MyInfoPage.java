package com.OrangeHrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.OrangeHrm.qa.Base.TestBase;

public class MyInfoPage extends TestBase {
	
	@FindBy(id="btnSave")
	WebElement EditBtn;
	
	@FindBy(id = "personal_txtEmpFirstName")
	WebElement FirstName;
	
	@FindBy(id = "personal_txtEmpMiddleName")
	WebElement MiddleName;
	
	@FindBy(id = "personal_txtEmpLastName")
	WebElement LastName;
	
	@FindBy(id = "personal_txtEmployeeId")
	WebElement EMPID;
	
	@FindBy(id = "btnSave")
	WebElement SaveBtn;
	


//Initializing the page objects:
	public MyInfoPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void createMyInfo(String MaterialStatus,String FtName,String MdName,String LtName,String EID) {
	
		EditBtn.click();
		Select select=new Select(driver.findElement(By.id("personal_cmbMarital")));
		select.selectByVisibleText(MaterialStatus);
		FirstName.sendKeys(FtName);
		MiddleName.sendKeys(MdName);
		LastName.sendKeys(LtName);
		EMPID.sendKeys(EID);
		SaveBtn.click();
		
		
		
	
	}
	
}