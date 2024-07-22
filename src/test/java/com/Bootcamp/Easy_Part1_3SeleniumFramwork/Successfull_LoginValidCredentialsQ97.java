package com.Bootcamp.Easy_Part1_3SeleniumFramwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Successfull_LoginValidCredentialsQ97 {

	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void loginWithValidCredentials() {
		driver.findElement(By.xpath("//a[@title= 'My Account']")).click();
		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("sosocat025@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Suher12345@");
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//a[text() = 'Change your password']")).isDisplayed());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
