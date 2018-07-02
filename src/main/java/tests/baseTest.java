package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseTest {
	
	String baseUrl = "https://www.amazon.com.mx";
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void initialize() {
		System.setProperty("webdriver.gecko.driver", "C:\\dev\\webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void end() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.close();
	}

}
