package com.epam.test.api.support.pageobject;

import com.epam.test.api.support.utils.WaitingUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends AbstractPage {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	private WebElement singInBtn;

	@FindBy(xpath = "//div[contains(@class,'auth-form-body')]/input[@id='login_field']")
	private WebElement loginField;

	@FindBy(xpath = "//div[contains(@class,'auth-form-body')]/input[@id='password']")
	private WebElement pswField;

	@FindBy(xpath = "//div[contains(@class,'auth-form-body')]/input[@name='commit']")
	private WebElement executeSingIn;


	@Override
	public boolean openPage() {
		return loginField.isDisplayed();
	}

	public void login() {
		singInBtn.click();
		WaitingUtils.waitForElementAppear(driver, loginField, 10);
		loginField.clear();
		loginField.sendKeys("nastya.mashkevich@gmail.com");
		pswField.clear();
		pswField.sendKeys("wertyu1");
		executeSingIn.click();
	}

}
