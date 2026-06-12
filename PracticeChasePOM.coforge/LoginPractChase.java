package com.PracticeChase.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPractChase {
	
WebDriver driver;
	
	//create constructor
	public LoginPractChase(WebDriver driver) { 
		
		this.driver = driver;
	}
	@FindBy(xpath = "//input[@id='userId-text-input-field']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password-text-input-field']")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"signin-button\"]")
	WebElement loginbtn;
	
	//create method
	public void login_PractChase(String usname, String passw) {
		username.sendKeys(usname);
		password.sendKeys(passw);
		loginbtn.click();
	}


}
