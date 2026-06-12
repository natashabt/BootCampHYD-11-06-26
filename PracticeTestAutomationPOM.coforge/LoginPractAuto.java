package com.Practicetestautomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPractAuto {
	
WebDriver driver;
	
	//create constructor
	public LoginPractAuto(WebDriver driver) { 
		
		this.driver = driver;
	}
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"submit\"]")
	WebElement loginbtn;
	
	//create method
	public void login_PracAuto(String usname, String passw) {
		username.sendKeys(usname);
		password.sendKeys(passw);
		loginbtn.click();
	}

}
