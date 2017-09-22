package com.epam.test.api.support.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitingUtils {

	public static void waitForElementAppear (WebDriver driver, WebElement element, int timeout) {
		Wait<WebDriver> wait = new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
