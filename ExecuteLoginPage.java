package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalculation.Pages.LoginEasyCal;
import com.Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome",
				"https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginEasyCal loginPageeasyCal = PageFactory.initElements(driver, LoginEasyCal.class);
		loginPageeasyCal.login_EasyCal("6209958774", "natashakumari@24");
	}

}
