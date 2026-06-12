package com.PracticeChase.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PracticeChase.Pages.LoginPractChase;
import com.Helper.BrowserFactory2;

public class ExecuteLoginPage2 {
	
	@Test
	public void CheckValidUser() throws InterruptedException {
		WebDriver driver = BrowserFactory2.BrowserOptions2("Chrome",
				"https://www.chase.com/");
		LoginPractChase loginPageChase = PageFactory.initElements(driver, LoginPractChase.class);
		
		Thread.sleep(10000);
		loginPageChase.login_PractChase("NatashaKumari24", "natashakumari@24");
	}

}
