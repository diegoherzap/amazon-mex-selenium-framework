/*author: diego.herzap@gmail.com*/

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public basePage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
}
