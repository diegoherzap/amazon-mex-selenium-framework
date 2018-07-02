package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class amazonHomePage extends basePage{

	public amazonHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	By primeLogo = By.id("nav-prime-logo");
	By searchInp = By.id("twotabsearchtextbox");
	By searchBtn = By.xpath("//*[@class='nav-input']");
	
	public void goToPrime() {
		driver.findElement(primeLogo).click();
	}
	
	public void searchItem(String item) {
		driver.findElement(searchInp).sendKeys(item);
		driver.findElement(searchBtn).click();
	}
	
	public void verifySearchResults() {
		wait.until(ExpectedConditions.urlContains("MMA+Shin+guards"));
		Assert.assertTrue(driver.getCurrentUrl().contains("MMA+Shin+guards"));
	}
}
