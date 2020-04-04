package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class A {
public static	WebDriver driver;
	@BeforeClass
	private void lanch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Facebook\\driver\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	}
	@AfterClass
	private void closeDriver() {

driver.quit();
	}
@BeforeMethod
private void startTime() {
	Date d= new Date();
	System.out.println(d);
}
@AfterClass
private void endTime() {
	Date d = new Date();
	System.out.println(d);
	
}
@Test
private void tc1() {
	
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("enoch");

WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys("123");
}

@Test
private void tc2() {
	
WebElement username = driver.findElement(By.id("email"));
username.sendKeys("raffale");

WebElement pass = driver.findElement(By.id("pass"));
pass.sendKeys("1234");





}

}
