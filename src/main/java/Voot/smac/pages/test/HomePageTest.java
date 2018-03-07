package Voot.smac.pages.test;

import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

	@Test(priority = 1, description = "TC_HMP_003 :- Verify 'Voot' logo is displayed and alligned in the Homepage.")
	public void verifyVootLogoinHomePage() throws InterruptedException {
		homepage.vootLogo();

	}

	@Test(priority = 2,description = "TC_HMP_003:- First level menu should contain following options.New Shows")
	public void verifynewshowLinkinHomePage() throws InterruptedException {
		homepage.verifynewshow();
	}

	@Test(priority = 3, groups = "Verification of Header Menu", description = "First level menu should contain following options.1.Shows")
	public void verifyshowsmenuinHomepage() throws InterruptedException {
		homepage.verifyshowsSectionmenu();
	}

	@Test(priority = 4, groups = "Verification of Header Menu", description = "First level menu should contain following options. Kids")
	public void verifykidsmenuinHomepage() throws InterruptedException {
		homepage.verifykidsSectionmenu();
	}

	@Test(priority = 5, groups = "Verification of Header Menu", description = "First level menu should contain following options.Channels")
	public void verifyChannelsmenuinHomepage() throws InterruptedException {
		homepage.verifychannelSectionmenu();
	}

	@Test(priority = 6, groups = "Verification of Header Menu", description = "First level menu should contain following options.Channels 4.Movies")
	public void verifyMoviesmenuinHomepage() throws InterruptedException {
		homepage.verifyMoviesSectionmenu();
	}

   @Test(priority = 7, groups = "Verify 'search' icon is displayed in the header of Homepage.")
	public void verifySearchinHomepage() throws InterruptedException {
		homepage.verifySearch_icon_inHeadermenu();
	}

  @Test(priority = 8, groups = "Verify 'Profile Avatar' icon is displayed in the header of Homepage.")
	public void verifyuserloginiconinHomepage() throws InterruptedException {
		homepage.verifyUserLogin_icon_in_Headermenu();

	}
	@Test(priority = 9, description = "Verify 'Next'  buttons on thumbnai")
	public void clickOnTheNextButtonOnCoursoual() throws InterruptedException {
		homepage.clickdotsincoural();
	}
	//@Test(priority = 10, description = "Verify thumbnail(In place holder section) is clickable and user is able to navigate to 'Playback' page.")
	public void Click_on_any_thumbnail_in_the_Master_head_corousel() throws InterruptedException {
	//	homepage
	}
	
	@Test(priority = 11, description = "verify weather User is able to click on the the next courasual forword button")
	public void verifyAddBannerSectionl() throws InterruptedException {
		homepage.verify_adbanner_in_homepge_body();
	}
@Test(priority = 12, description ="Verify 'Previous' buttons on thumbnail ")
	public void clickOnThePreviousButtonOnCoursoual() throws InterruptedException {
		homepage.clickonbackButtonOnCarosual();
	}
}