package Voot.smac.pages.test;

import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

	@Test(priority = 1, groups = "Verification of Header Menu", description = "verify weather vootlogo is present in headerSection or not")
	public void verifyVootLogoinHomePage() {
		homepage.vootLogo();

	}

	@Test(priority = 2, groups = "Verification of Header Menu", description = "verify weather Newshowlink is present in headerSection or not")
	public void verifynewshowLinkinHomePage() {
		homepage.verifynewshow();
	}

	@Test(priority = 3, groups = "Verification of Header Menu", description = "verify weather showslink is present in headerSectionor not")
	public void verifyshowsmenuinHomepage() {
		homepage.verifyshowsSectionmenu();
	}

	@Test(priority = 4, groups = "Verification of Header Menu", description = "verify weather Kidslink is present in headerSection or not")
	public void verifykidsmenuinHomepage() {
		homepage.verifykidsSectionmenu();
	}

	@Test(priority = 5, groups = "Verification of Header Menu", description = "verify weather channelslink is present in headersectonor not")
	public void verifyChannelsmenuinHomepage() {
		homepage.verifychannelSectionmenu();
	}

	@Test(priority = 6, groups = "Verification of Header Menu", description = "verify weather MoviesMenu is present in headerSection or not")
	public void verifyMoviesmenuinHomepage() {
		homepage.verifyMoviesSectionmenu();
	}

	@Test(priority = 7, groups = "Verification of Header Menu", description = "verify weather Search icon is present in headerSection or not")
	public void verifySearchinHomepage() {
		homepage.verifySearch_icon_inHeadermenu();
	}

	@Test(priority = 8, groups = "Verification of Header Menu", description = "verify weather User_Login_Icon is present in headerSection or not")
	public void verifyuserloginiconinHomepage() throws InterruptedException {
		homepage.verifyUserLogin_icon_in_Headermenu();

	}
	@Test(priority = 9, description = "verify weather User is able to click on the the next courasual forword button")
	public void clickOnTheNextButtonOnCoursoual() throws InterruptedException {
		homepage.clickdotsincoural();
	}
	@Test(priority = 10, description = "verify weather User is able to click on the the next courasual forword button")
	public void verifyAddBannerSectionl() throws InterruptedException {
		homepage.verify_adbanner_in_homepge_body();
	}
	@Test(priority = 11, description = "verify weather User is able to click on the the Previous button on  courasual ")
	public void clickOnThePreviousButtonOnCoursoual() throws InterruptedException {
		homepage.clickonbackButtonOnCarosual();
	}
}