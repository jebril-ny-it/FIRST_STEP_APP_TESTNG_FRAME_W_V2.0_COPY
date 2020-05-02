package com.Amgen.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Amgen.qa.base.TestBase;
import com.Amgen.qa.pages.CardInformationPage;
import com.Amgen.qa.pages.EligibilityPage;
import com.Amgen.qa.pages.PatientInformationPage;
import com.Amgen.qa.pages.PhysicianInformationPage;
import com.Amgen.qa.pages.StandAlonePage;
import com.Amgen.qa.util.TestUtil;

public class PhysicianInformationPageTest extends TestBase {

	// @AUTHOR JEBRIL
	// SWITCHED ALL METHODS INTO PATIENTINFORMATIONTEST
	// NOT USING THIS PAGE WILL ADJUST LATER

	StandAlonePage standAlonePage;
	EligibilityPage eligibilityPage;
	CardInformationPage cardInformationPage;
	PatientInformationPage patientInformationPage;
	PhysicianInformationPage physicianInformationPage;

	String sheetName = "PATIENT INFORMATION";

	String sheetNamepage2 = "PHYSICIAN INFORMATION";

	public PhysicianInformationPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initalization();
		eligibilityPage = new EligibilityPage();
		standAlonePage = new StandAlonePage();
		cardInformationPage = new CardInformationPage();
		patientInformationPage = new PatientInformationPage();
		physicianInformationPage = new PhysicianInformationPage();
		Thread.sleep(3000);
		eligibilityPage = standAlonePage.clickOnGetStarted();
		eligibilityPage.clickOnradioBtn1();
		eligibilityPage.clickonRadiobtnQ2();
		eligibilityPage.clickOnradioBtnQ3();
		eligibilityPage.clickOnradioBtnQ4();
		eligibilityPage.clickOnradioBtnQ5();
		cardInformationPage = eligibilityPage.clickOnVerifySubmitBtn();
		cardInformationPage.clickOnpg2RadioBtn();
		patientInformationPage = cardInformationPage.continuePge2Btm();
		

	
	}

	@DataProvider
	public Object[][] getphysicianTestData() {
		Object datapg2[][] = TestUtil.getTestData(sheetNamepage2);
		return datapg2;
	}

	@Test(dataProvider = "getphysicianTestData", singleThreaded = true)
	public void phisciansinformationPageTest(String DoctorsFirstName, String DoctorsLastName, String PracticeName,
			String DoctorStreetAddress, String City, String PhoneNumber, String ZipCode) {

		
		
		physicianInformationPage.fillOutDoctorInformation(DoctorsFirstName, DoctorsLastName, PracticeName,
				DoctorStreetAddress, City, PhoneNumber, ZipCode);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
