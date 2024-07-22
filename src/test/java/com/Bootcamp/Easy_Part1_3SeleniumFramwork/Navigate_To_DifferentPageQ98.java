package com.Bootcamp.Easy_Part1_3SeleniumFramwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigate_To_DifferentPageQ98 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}

	@Test
	public void navigateToDifferentLink() {
		driver.findElement(By.xpath("//a[text() ='Apple Cinema 30\"']")).click();
		String ExpectedMessage = "This product has a minimum quantity of 2";
		String ActualMessage = driver.findElement(By.xpath("//div[@class = 'alert alert-info']")).getText();
		Assert.assertTrue(ActualMessage.contains(ExpectedMessage));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
}
