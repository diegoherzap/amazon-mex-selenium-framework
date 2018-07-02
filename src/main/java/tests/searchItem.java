package tests;
import org.testng.annotations.Test;

import pages.amazonHomePage;

public class searchItem extends baseTest{

	@Test
	public void searchItemByKeyword() {
		amazonHomePage ahp = new amazonHomePage(driver, wait);
		ahp.searchItem("MMA Shin guards");
		ahp.verifySearchResults();
	}

}
