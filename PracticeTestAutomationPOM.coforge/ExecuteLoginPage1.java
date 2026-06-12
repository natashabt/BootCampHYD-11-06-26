package com.Practicetestautomation.TestCases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory1;
import com.Practicetestautomation.Pages.LoginPractAuto;

public class ExecuteLoginPage1 {
	
	@Test
	public void CheckUser() {
		WebDriver driver = BrowserFactory1.BrowserOptions1("Chrome",
				"https://practicetestautomation.com/practice-test-login/");
		LoginPractAuto loginPagePractAuto = PageFactory.initElements(driver, LoginPractAuto.class);
		loginPagePractAuto.login_PracAuto("student", "Password123");
	}

}
