package Voot.smac.pages.test;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;




public class HomePageTest extends BaseClass {

@Test(priority = 1, description = "Verify Mega menu options in the Homepage of 'Voot' Application ")
	public void verifyVootLogoinHomePage() throws InterruptedException {
	extentTest = extent.startTest("First level menu should contain following options.New Shows");
	Assert.assertTrue(homepage.vootLogo());
	Reporter.log("voot logo is present in home page",true);
	Assert.assertTrue(homepage.verifynewshow());
	Reporter.log("New show is present in home page",true);
    Assert.assertTrue(homepage.verifyshowsSectionmenu());
	Reporter.log("show Menu is present in home page",true);
	Assert.assertTrue(homepage.verifykidsSectionmenu());
	Reporter.log("Kids Tab  is present in home page",true);
	Assert.assertTrue(homepage.verifychannelSectionmenu());
	Reporter.log("Channel menu & Tab  is present in home page",true);
    Assert.assertTrue(homepage.verifyMoviesSectionmenu());
	Reporter.log("Channel menu & Tab  is present in home page",true);
	Assert.assertTrue(homepage.verifySearch_icon_inHeadermenu());;
	Reporter.log("Search icon is present in home page",true);
	Assert.assertTrue(homepage.verifyUserLogin_icon_in_Headermenu());
	Reporter.log("Profile icon is present in home page",true);
	}

	@Test(priority = 2, description = "Verify 'Next'  buttons on thumbnai")
	public void clickOnTheNextButtonOnCoursoual() throws InterruptedException {
		  extentTest = extent.startTest("Verify 'Next'  buttons on thumbnail");
		homepage.clickdotsincoural();
	}

	
	@Test(priority = 3, description = "verify weather User is able to see add banner in home page")
	public void verifyAddBannerSectionl() throws InterruptedException {
		  extentTest = extent.startTest("verify weather User is able to see add banner in home page");
		homepage.verify_adbanner_in_homepge_body();
	}
	
	@Test(priority = 4, description = "verify weather User is able to see courasual description text Value")
	public void verifyDescriptionTextValueOFMasterCarousal() throws InterruptedException {
		Thread.sleep(2000);
		extentTest = extent.startTest("verify weather User is able to see courasual description text Value");
		homepage.clickOnthumbnailinthemasterheadcorousel();
	}
	
	
 @Test(priority = 5, description ="Verify 'Previous' buttons on  the main carousal  thumbnail ")
	public void clickOnThePreviousButtonOnCoursoual() throws InterruptedException {
		extentTest = extent.startTest("Verify 'Previous' buttons on  main carousal  thumbnail");
		homepage.clickonbackButtonOnCarosual();
	}
 @Test(priority = 6, description ="click on the 'more ' buttons on the HomePage and navigate to show details page and verify the show name ")
	public void verifyMoreButtonInHomePage ()throws InterruptedException {
		extentTest = extent.startTest("click on the 'more ' buttons on the HomePage and navigate to show details page and verify the show name and scrolling page down and up ");
		homepage.verifyMoreButtonfirstTray();
		homepage.verifyafterClickonMoreButtonTrayName();
	
	}

 
}