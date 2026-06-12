package com.PracticeProfile.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageProfile {
	
WebDriver driver;
	
	//create constructor
	public LoginPageProfile(WebDriver driver) { 
		
		this.driver = driver;
	}
	@FindBy(id = "id_login")
	WebElement username;
	
	@FindBy(id = "id_password")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"loginForm\"]/p/button")
	WebElement loginbtn;
	
	//create method
	public void login_PractChase(String usname, String passw) {
		username.sendKeys(usname);
		password.sendKeys(passw);
		loginbtn.click();
	}


}
