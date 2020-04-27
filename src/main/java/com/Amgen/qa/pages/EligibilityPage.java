package com.Amgen.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amgen.qa.base.TestBase;

public class EligibilityPage extends TestBase {

	@FindBy(xpath = "//div[@class='col-a']//label[@for='toggle-on-1']")
	WebElement radioyesBtnQ1;

	@FindBy(xpath = "//div[@class='col-a']//label[@for='toggle-on-2']")
	WebElement radioYesBtnQ2;

	@FindBy(xpath = "//div[@class='col-a']//label[@for='toggle-off-3']")
	WebElement radioNoBtnQ3;

	@FindBy(xpath = "//div[@class='col-a']//label[@for='toggle-off-6']")
	WebElement radioNoBtnQ4;

	@FindBy(xpath = "//div[@class='col-a']//label[@for='toggle-on-7']")
	WebElement radioNoBtnQ5;

	@FindBy(xpath = "//input[@id='subnewtopic']")
	WebElement verifySubmitBtn;

	public EligibilityPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnradioBtn1() {
		radioyesBtnQ1.click();
	}

	public void clickonRadiobtnQ2() {
		radioYesBtnQ2.click();
	}

	public void clickOnradioBtnQ3() {
		radioNoBtnQ3.click();
	}

	public void clickOnradioBtnQ4() {
		radioNoBtnQ4.click();
	}

	public void clickOnradioBtnQ5() {
		radioNoBtnQ5.click();
	}

	public CardInformationPage clickOnVerifySubmitBtn() {
		verifySubmitBtn.click();
		return new CardInformationPage();
	}
}
