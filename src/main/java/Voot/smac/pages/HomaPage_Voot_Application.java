package Voot.smac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class HomaPage_Voot_Application  extends Uielements{

	
	
	WebDriver driver;
	WebElement vootlogo, newShow,showdrop_down ,Kidsdrop_down ,channeldrop_down,Moviesdrop_down,
	searchIcon,UserLoginIcon;
	GenericFunctions function=new GenericFunctions(driver);
	
	public HomaPage_Voot_Application(WebDriver driver) {

		this.driver = driver;

	}

	public boolean vootLogo() {
	vootlogo = driver.findElement(By.xpath(appvootlogo));
		if (vootlogo.isDisplayed()) {
			function.highLighterMethod(driver, vootlogo);
			System.out.println("voot logo is present and it is displaying in the portal");
			Reporter.log("voot logo is present and it is displaying in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifynewshow() {
     newShow = driver.findElement(By.xpath(newShowname));
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

	public boolean verifyshowsSectionmenu() {
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

	public boolean verifykidsSectionmenu() {
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

	public boolean verifychannelSectionmenu() {
		 channeldrop_down = driver.findElement(By.id("channels_dropbtn"));
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

	public boolean verifyMoviesSectionmenu() {
	Moviesdrop_down = driver.findElement(By.id("movies_dropbtn"));
	function.	highLighterMethod(driver, Moviesdrop_down);
		String MoviesName = Moviesdrop_down.getText();
		System.out.println(MoviesName);
		if (Moviesdrop_down.isDisplayed()) {
			System.out.println(MoviesName + ":::::and it is displaying in the portal");
			Reporter.log("Movies link is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifySearch_icon_inHeadermenu() {
	searchIcon = driver.findElement(By.className("VSearch"));
	function.highLighterMethod(driver, searchIcon);
		if (searchIcon.isDisplayed()) {
			System.out.println(" Search icon is displaying in the portal");
			Reporter.log("Search icon is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifyUserLogin_icon_in_Headermenu() {
		UserLoginIcon = driver.findElement(By.className("user-login"));
		function.highLighterMethod(driver, UserLoginIcon);
		if (UserLoginIcon.isDisplayed()) {
			System.out.println(" User login icon is displaying in the portal");
			Reporter.log("User login logo is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}
	
	
}
