package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PackagesPage{
	
	static WebDriver driver;
	WebDriverWait wait;
	//Locators of the page
    By currentCountry = By.id("country-btn");
	By kwCountry = By.id("kw");
	By saCountry = By.id("sa");
	By bhCountry = By.id("bh");
	By litePackage = By.id("name-lite");
	By classicPackage = By.id("name-classic");
	By premiumPackage =By.id("name-premium");
	By currencyLite = By.id("currency-lite");
	By currencyClassic= By.id("currency-classic");
	By currencyPremium = By.id("currency-premium");


	
	
	// Constructor
	public PackagesPage(WebDriver driver) {
		PackagesPage.driver = driver;
		wait =new WebDriverWait(driver, 1000);
		// TODO Auto-generated constructor stub
	}

	// click on current country button
		public void clickCurrentCountry() throws InterruptedException {
	
			wait.until(ExpectedConditions.visibilityOfElementLocated(currentCountry));
			driver.findElement(currentCountry).click();
		}
	// click on Saudi country button
	public void clickSACountry() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(saCountry));
		driver.findElement(saCountry).click();
	}
	// click on Kuwait country button
	public void clickKWCountry() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(kwCountry));
		driver.findElement(kwCountry).click();
	}
	// click on Bahrin country button
	public void clickBHCountry() throws InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(bhCountry));
		driver.findElement(bhCountry).click();
	}
	//Verify Lite Package exists
	public String verifyLitePackageExists()throws InterruptedException{

		wait.until(ExpectedConditions.visibilityOfElementLocated(litePackage));

		String actualText = driver.findElement(litePackage).getText();
		return actualText;


	}


	//Verify Classic Package exists
	public String verifyClassicPackageExists()throws InterruptedException{

		wait.until(ExpectedConditions.visibilityOfElementLocated(classicPackage));

		String actualText = driver.findElement(classicPackage).getText();
		return actualText;


	}
	//Verify Premium Package exists
	public String verifyPremiumPackageExists()throws InterruptedException{

		wait.until(ExpectedConditions.visibilityOfElementLocated(premiumPackage));

		String actualText = driver.findElement(premiumPackage).getText();
		return actualText;


	}

// get lite package price
public String getLitePackagePricing()throws InterruptedException{

	wait.until(ExpectedConditions.visibilityOfElementLocated(currencyLite));

	String actualText = driver.findElement(premiumPackage).getText();
	return actualText;


}

	// get classic package price
	public String getLitePackagePricing()throws InterruptedException{

		wait.until(ExpectedConditions.visibilityOfElementLocated(currencyClassic));

		String actualText = driver.findElement(premiumPackage).getText();
		return actualText;


	}
	// get premium package price
	public String getLitePackagePricing()throws InterruptedException{

		wait.until(ExpectedConditions.visibilityOfElementLocated(currencyPremium));

		String actualText = driver.findElement(premiumPackage).getText();
		return actualText;


	}

}
