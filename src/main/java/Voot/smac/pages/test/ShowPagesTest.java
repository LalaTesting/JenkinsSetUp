package Voot.smac.pages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShowPagesTest extends BaseClass {

	@Test(priority = 1, description = "TC_HMP_004 :- Verify list overlay is displayed when user mousehover on 'Shows' in the header menu of  'Homepage'. ")
	public void clickedshowlink() throws InterruptedException {
		extentTest = extent.startTest(" Verify list overlay is displayed when user mousehover on 'Shows' in the header menu of  'Homepage'");
		Assert.assertTrue(showpage.clickShowsLinkinheader());

	}

	@Test(priority =2,description="Verify weather user is able to click onthe kids link on the header")
	public void clickedkidslink() throws InterruptedException {
		extentTest = extent.startTest("Verify weather user is able to click onthe kids link on the header");
		Assert.assertTrue(showpage.clickKidsMenuLinkinheader());

	}
}
