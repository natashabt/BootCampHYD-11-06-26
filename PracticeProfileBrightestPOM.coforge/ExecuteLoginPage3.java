package com.PracticeProfile.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory3;
import com.PracticeProfile.Pages.LoginPageProfile;

public class ExecuteLoginPage3 {
	
	public class ExecuteLoginPage2 {
		
		@Test
		public void CheckValidUser() throws InterruptedException {
			WebDriver driver = BrowserFactory3.BrowserOptions3("Chrome",
					"https://profile.brightest.org/accounts/login/");
			LoginPageProfile loginPageChase = PageFactory.initElements(driver, LoginPageProfile.class);
			
			loginPageChase.login_PractChase("NatashaKumari24", "natashakumari@24");
		}
	}

}
