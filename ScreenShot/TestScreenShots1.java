package ScreenShotsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Reusability;

public class TestScreenShots1 {
	@Test
	public void Browser() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.manage().window().maximize();
		
		Reusability.capturedScreenShot(driver, "A. Launch Application - TakeScreenShot");
		
		driver.findElement(By.id("log_email")).sendKeys("6209958774");
		driver.findElement(By.id("log_password")).sendKeys("Getlost@69");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		Thread.sleep(10000);
		
		Reusability.capturedScreenShot(driver, "B. Click Sign In Button - TakeScreenShot");
	}

}
