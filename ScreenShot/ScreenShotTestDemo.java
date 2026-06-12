package com.ScreenShotWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShotTestDemo {
	
	WebDriver driver;
	String url = "https://www.nopcommerce.com/en";
	
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	@Test
	public void DragDropTest() throws IOException {
		
		 File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("./ScreenShots/Homepage.png"));
		 
	}
	
	@AfterTest
	public void teardown() {
		
	}

}
