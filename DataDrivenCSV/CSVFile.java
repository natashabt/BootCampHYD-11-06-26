package com.DataDrivenTesingUsingCSVFile;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class CSVFile {
	
	WebDriver driver; 
	String url = "http://only-testing-blog.blogspot.com/2014/05/form.html";
	String CsvPath = "C:\\Selenium_Java_Programs/CSVfile.csv";
	
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
	}
	
	@Test
	public void CSVTest() throws IOException, InterruptedException {
		
		 CSVReader reader = new CSVReader(new FileReader(CsvPath));
		 String[] csvCell;
		 while((csvCell = reader.readNext()) != null) {
			 String FName = csvCell[0];
			 String LName = csvCell[1];
			 String Email = csvCell[2];
			 String MNumb = csvCell[3];
			 String CName = csvCell[4];
			 
			 driver.findElement(By.name("FirstName")).sendKeys(FName);
			 driver.findElement(By.name("LastName")).sendKeys(LName);
			 driver.findElement(By.name("EmailID")).sendKeys(Email);
			 driver.findElement(By.name("MobNo")).sendKeys(MNumb);
			 driver.findElement(By.name("Company")).sendKeys(CName);
			 
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//input[@value='Submit']")).click();
			 Thread.sleep(10000);
			 driver.switchTo().alert().accept();
		 }
		 
	}
	
	@AfterTest
	public void teardown() {
		
	}

}
