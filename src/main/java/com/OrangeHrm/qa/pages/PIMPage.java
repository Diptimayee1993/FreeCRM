package com.OrangeHrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrm.qa.Base.TestBase;

public class PIMPage extends TestBase {

	@FindBy(xpath="//*[id=\"resultTable\"]/tr[0]")
	WebElement PIMLink;

	// initialilizing the page Object:

	public PIMPage() {
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(id = "empsearch_employee_name_empName")
	WebElement EMPName;

	@FindBy(id = "empsearch_id")
	WebElement EMPID;

	@FindBy(id = "empsearch_supervisor_name")
	WebElement SupName;
	
	public void enterEmpName(String Element,String EmpName) {
		if(Element.equalsIgnoreCase("EMPName")) {
			EMPName.sendKeys(EmpName);
		}
		if(Element.equalsIgnoreCase("EMPID")) {
			EMPID.sendKeys(EmpName);
		}
		if(Element.equalsIgnoreCase("SupName")) {
			SupName.sendKeys(EmpName);
		}
		
	}
	
	

}
