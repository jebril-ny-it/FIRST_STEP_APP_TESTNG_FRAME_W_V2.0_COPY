package com.Amgen.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amgen.qa.base.TestBase;

public class PhysicianInformationPage extends TestBase {

	// @AUTHOR JEBRIL
	// SWITCHED ALL METHODS INTO PATIENTINFORMATIONPAGE
	// NOT USING THIS PAGE WILL ADJUST LATER

	@FindBy(xpath = "//input[@id='doc_first_name']")
	WebElement doctorfirstName;

	@FindBy(xpath = "//input[@id='doc_last_name']")
	WebElement doctorlasttName;

	@FindBy(xpath = "//input[@id='doc_practice_name']")
	WebElement doctorPracticeName;

	@FindBy(xpath = "//input[@id='doc_street']")
	WebElement doctorStreetAddress;

	@FindBy(xpath = "//input[@id='doc_city']")
	WebElement doctorcityname;

	@FindBy(xpath = "//input[@id='doc_phone']")
	WebElement doctorphoneNumber;

	@FindBy(xpath = "//input[@id='doc_zip']")
	WebElement doctorzipCode;

	public PhysicianInformationPage() {
		PageFactory.initElements(driver, this);
	}

	public void fillOutDoctorInformation(String docFName, String docLName, String docPracticeName,
			String docStreetAddrss, String docCity, String docPhoneNum, String docZipCode) {
		doctorfirstName.sendKeys(docFName);
		doctorlasttName.sendKeys(docLName);
		doctorPracticeName.sendKeys(docPracticeName);
		doctorStreetAddress.sendKeys(docStreetAddrss);
		doctorcityname.sendKeys(docCity);
		doctorphoneNumber.sendKeys(docPhoneNum);
		doctorzipCode.sendKeys(docZipCode);

	}

}
