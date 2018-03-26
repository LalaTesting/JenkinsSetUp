package Voot.smac.pages.test;

import org.testng.annotations.Test;




public class HomePageTest extends BaseClass {

@Test(priority = 1, description = "TC_HMP_003 :- Verify 'Voot' logo is displayed and alligned in the Homepage.")
	public void verifyVootLogoinHomePage() throws InterruptedException {
	extentTest = extent.startTest("First level menu should contain following options.New Shows");
	homepage.vootLogo();
	
	
	}

	@Test(priority = 2,description = "TC_HMP_003:- First level menu should contain following options.New Shows")
	public void verifynewshowLinkinHomePage() throws InterruptedException {
		extentTest = extent.startTest("First level menu should contain following options.New Shows");
		//extentTest.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");
		homepage.verifynewshow();
		
	}

	@Test(priority = 3, groups = "Verification of Header Menu", description = "First level menu should contain following options.1.Shows")
	public void verifyshowsmenuinHomepage() throws InterruptedException {
		extentTest = extent.startTest("First level menu should contain following options.1.Shows");
		homepage.verifyshowsSectionmenu();
	}

	@Test(priority = 4, groups = "Verification of Header Menu", description = "First level menu should contain following options. Kids")
	public void verifykidsmenuinHomepage() throws InterruptedException {
		extentTest = extent.startTest("First level menu should contain following options. Kids");
		homepage.verifykidsSectionmenu();
	}

	@Test(priority = 5, groups = "Verification of Header Menu", description = "First level menu should contain following options.Channels")
	public void verifyChannelsmenuinHomepage() throws InterruptedException {
		extentTest = extent.startTest("First level menu should contain following options.Channels");
		homepage.verifychannelSectionmenu();
	}

	@Test(priority = 6, groups = "Verification of Header Menu", description = "First level menu should contain following options.Channels 4.Movies")
	public void verifyMoviesmenuinHomepage() throws InterruptedException {
		extentTest = extent.startTest("First level menu should contain following options.Channels Movies");
		homepage.verifyMoviesSectionmenu();
	}

   @Test(priority = 7, groups = "Verify 'search' icon is displayed in the header of Homepage.")
	public void verifySearchinHomepage() throws InterruptedException {
		extentTest = extent.startTest("Verify 'search' icon is displayed in the header of Homepage");
		homepage.verifySearch_icon_inHeadermenu();
	}

  @Test(priority = 8, groups = "Verify 'Profile Avatar' icon is displayed in the header of Homepage.")
	public void verifyuserloginiconinHomepage() throws InterruptedException {
	  extentTest = extent.startTest("Verify 'Profile Avatar' icon is displayed in the header of Homepage");
		homepage.verifyUserLogin_icon_in_Headermenu();

	}
	@Test(priority = 9, description = "Verify 'Next'  buttons on thumbnai")
	public void clickOnTheNextButtonOnCoursoual() throws InterruptedException {
		  extentTest = extent.startTest("Verify 'Next'  buttons on thumbnail");
		homepage.clickdotsincoural();
	}

	
	@Test(priority = 11, description = "verify weather User is able to see add banner in home page")
	public void verifyAddBannerSectionl() throws InterruptedException {
		  extentTest = extent.startTest("verify weather User is able to see add banner in home page");
		homepage.verify_adbanner_in_homepge_body();
	}
	
	@Test(priority = 12, description = "verify weather User is able to see courasual description text Value")
	public void verifyDescriptionTextValueOFMasterCarousal() throws InterruptedException {
		Thread.sleep(2000);
		extentTest = extent.startTest("verify weather User is able to see courasual description text Value");
		homepage.clickOnthumbnailinthemasterheadcorousel();
	}
	
	
 @Test(priority = 12, description ="Verify 'Previous' buttons on  the main carousal  thumbnail ")
	public void clickOnThePreviousButtonOnCoursoual() throws InterruptedException {
		extentTest = extent.startTest("Verify 'Previous' buttons on  main carousal  thumbnail");
		homepage.clickonbackButtonOnCarosual();
	}
 @Test(priority = 13, description ="click on the 'more ' buttons on the HomePage and navigate to show details page and verify the show name ")
	public void verifyMoreButtonInHomePage ()throws InterruptedException {
		extentTest = extent.startTest("click on the 'more ' buttons on the HomePage and navigate to show details page and verify the show name and scrolling page down and up ");
		homepage.verifyMoreButtonfirstTray();
		homepage.verifyafterClickonMoreButtonTrayName();
	
	}

 
}