package com.Bootcamp.Easy_Part1_3SeleniumFramwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Title_PageQ96 {

	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	@Test
	public void validatePageTitle() {
		String ExpectedTitle = "Your Store";
		String ActualTitle =driver.getTitle();
		Assert.assertTrue(ActualTitle.contains(ExpectedTitle));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
