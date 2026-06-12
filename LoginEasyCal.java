package com.Easycalculation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEasyCal {
	
	WebDriver driver;
	
	//create constructor
	public void LoginEsayCal(WebDriver driver) {//constructor don't have return type so we use this 
		
		this.driver = driver;
	}
	@FindBy(id = "log_email")
	WebElement email;
	
	@FindBy(id = "log_password")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='log_submit']")
	WebElement loginbtn;
	
	//create method
	public void login_EasyCal(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
	
	

}
