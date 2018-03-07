package Voot.smac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class HomaPage_Voot_Application extends Uielements {

	WebDriver driver;
	WebElement vootlogo, newShow, showdrop_down, Kidsdrop_down, channeldrop_down, Moviesdrop_down, searchIcon,
			dotbutton, clickingonthe5dots, UserLoginIcon, NextButton, backButton, adbanner_body;
	GenericFunctions function = new GenericFunctions(driver);

	public HomaPage_Voot_Application(WebDriver driver) {

		this.driver = driver;

	}

	public boolean vootLogo() throws InterruptedException {
		vootlogo = driver.findElement(By.xpath(appvootlogo));
		if (vootlogo.isDisplayed()) {
			function.highLighterMethod(driver, vootlogo);
			System.out.println("voot logo is present and it is displaying in the portal");
			Reporter.log("voot logo is present and it is displaying in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifynewshow() throws InterruptedException {
		newShow = driver.findElement(By.id(newShowname));
		function.highLighterMethod(driver, newShow);
		String showName = newShow.getText();
		System.out.println(showName);
		if (newShow.isDisplayed() && newShow.isEnabled()) {
			System.out.println(showName + ":::::and it is displaying & " + showName + " is clickable in the portal");
			Reporter.log("showName and it is displaying & " + showName + " is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifyshowsSectionmenu() throws InterruptedException {
		showdrop_down = driver.findElement(By.id(dropdownShow_id));
		function.highLighterMethod(driver, showdrop_down);
		String showsNameinshowmenu = showdrop_down.getText();
		System.out.println(showsNameinshowmenu);
		if (showdrop_down.isDisplayed() && showdrop_down.isEnabled()) {

			System.out.println(showsNameinshowmenu + ":::::&" + showsNameinshowmenu
					+ "it is displaying & clickable in the portal");
			Reporter.log("showsNameinshowmenu showsNameinshowmenu it is displaying & clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifykidsSectionmenu() throws InterruptedException {
		Kidsdrop_down = driver.findElement(By.id("kids_dropbtn"));
		function.highLighterMethod(driver, Kidsdrop_down);
		String kidsName = Kidsdrop_down.getText();
		System.out.println(kidsName);
		if (Kidsdrop_down.isDisplayed()) {
			System.out.println(kidsName + ":::::and it is displaying in the portal");
			Reporter.log("kids link is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifychannelSectionmenu() throws InterruptedException {
		channeldrop_down = driver.findElement(By.id("channels_dropbtn"));
		System.out.println("Verify list overlay is displayed when user mousehover on 'Channels' in the header menu of  'Homepage'.");
		function.highLighterMethod(driver, channeldrop_down);
		String channelName = channeldrop_down.getText();
		System.out.println(channelName);
		if (channeldrop_down.isDisplayed()) {
			System.out.println(channelName + ":::::and it is displaying in the portal");
			Reporter.log("channls link is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifyMoviesSectionmenu() throws InterruptedException {
		Moviesdrop_down = driver.findElement(By.id("movies_dropbtn"));
		function.highLighterMethod(driver, Moviesdrop_down);
		System.out.println("Verify list overlay is displayed when user mousehover on 'Movies' in the header menu of  'Homepage'.");
		String MoviesName = Moviesdrop_down.getText();
		System.out.println(MoviesName);
		if (Moviesdrop_down.isDisplayed()) {
			System.out.println(MoviesName + ":::::and it is displaying in the portal");
			Reporter.log("Movies link is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifySearch_icon_inHeadermenu() throws InterruptedException {
		searchIcon = driver.findElement(By.className("VSearch"));
		function.highLighterMethod(driver, searchIcon);
		if (searchIcon.isDisplayed()) {
			System.out.println(" Search icon is displaying in the portal");
			Reporter.log("Search icon is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifyUserLogin_icon_in_Headermenu() throws InterruptedException {
		UserLoginIcon = driver.findElement(By.className("user-login"));
		function.highLighterMethod(driver, UserLoginIcon);
		function.sleepMode(1000);
		if (UserLoginIcon.isDisplayed()) {
			System.out.println(" User login icon is displaying in the portal");
			Reporter.log("User login logo is displaying and it is clickable in the portal");

			return true;
		} else
			return false;
	}

	public boolean clickonNextButtonOnCarosual() throws InterruptedException {
		NextButton = driver.findElement(By.xpath(foarwordButtoncarausal));
function.highLighterMethod(driver, NextButton);
		if (NextButton.isDisplayed()) {

			// for(int i=0;i<4;i++)
			NextButton.click();
			function.sleepMode(2000);
			return true;
		} else
			return false;
	}
	public boolean verify_adbanner_in_homepge_body() throws InterruptedException {
		adbanner_body = driver.findElement(By.xpath(adbannerxpath));
		function.highLighterMethod(driver, adbanner_body);
		Reporter.log("Ad banner has been  Highlighted");
		function.sleepMode(2000);
		function.scroll_top_to_bottom(driver);
		function.sleepMode(2000);

		if (adbanner_body.isDisplayed()) {
			System.out.println(" Ad Banner is displaying on the home page screen");
			Reporter.log("Ad Banner is displaying on the home page screen");
			function.scrollDownFromTopOfPage(driver);
			function.sleepMode(2000);
			return true;
		} else
			return false;
	}
	/*public boolean clickOnthumbnailinthemasterheadcorousel () throws InterruptedException {
		 = driver.findElement(By.xpath(adbannerxpath));
		function.highLighterMethod(driver, adbanner_body);
		Reporter.log("Ad banner has been  Highlighted");
		function.sleepMode(2000);
		function.scroll_top_to_bottom(driver);
		function.sleepMode(2000);

		if (adbanner_body.isDisplayed()) {
			System.out.println(" Ad Banner is displaying on the home page screen");
			Reporter.log("Ad Banner is displaying on the home page screen");
			function.scrollDownFromTopOfPage(driver);
			function.sleepMode(2000);
			return true;
		} else
			return false;
	}*/
	public void clickdotsincoural() throws InterruptedException {
		List<WebElement> dotbutton = driver.findElements(By.xpath(dotsxpathincarosual));
		int countsdots = dotbutton.size();
		System.out.println("Verify 'Pagination markers' and count of them." + countsdots);
		for (int i = 0; i < countsdots; i++) {
			clickonNextButtonOnCarosual();
			System.out.println("Next button is clicking");
			function.sleepMode(2000);
		}
	}
	public boolean clickonbackButtonOnCarosual() throws InterruptedException {
		backButton = driver.findElement(By.xpath(BackButtononcarousal));
		function.highLighterMethod(driver, backButton);
		Reporter.log("Back button is  Highlighted");
		function.sleepMode(2000);
		if (backButton.isDisplayed()) {
			for(int i=0;i<=4;i++)
			backButton.click();
			//function.sleepMode(2000);
			return true;
		} else
			return false;
	}
}
