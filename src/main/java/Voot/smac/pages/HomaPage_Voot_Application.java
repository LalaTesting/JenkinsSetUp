package Voot.smac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomaPage_Voot_Application {

	WebDriver driver;
	By VootLogoXpath=By.xpath("//a[@class='voot-brand-logo']");
	public HomaPage_Voot_Application(WebDriver driver) {

		this.driver = driver;

	}

	public boolean vootLogo() {
		WebElement vootlogo = driver.findElement(VootLogoXpath);

		if (vootlogo.isDisplayed()) {
			System.out.println("voot logo is present and it is displaying in the portal");
			Reporter.log("voot logo is present and it is displaying in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifynewshow() {
		WebElement newShow_bigbss = driver.findElement(By.id("risingStarS02_dropbtn"));
		String showName = newShow_bigbss.getText();
		System.out.println(showName);
		if (newShow_bigbss.isDisplayed() && newShow_bigbss.isEnabled()) {
			System.out.println(showName + ":::::and it is displaying & " + showName + " is clickable in the portal");
			Reporter.log("showName and it is displaying & " + showName + " is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifyshowsSectionmenu() {
		WebElement showdrop_down = driver.findElement(By.id("shows_dropbtn"));
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
		WebElement Kidsdrop_down = driver.findElement(By.id("kids_dropbtn"));
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
		WebElement channeldrop_down = driver.findElement(By.id("channels_dropbtn"));
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
		WebElement Moviesdrop_down = driver.findElement(By.id("movies_dropbtn"));
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
		WebElement searchIcon = driver.findElement(By.className("VSearch"));
		if (searchIcon.isDisplayed()) {
			System.out.println(" Search icon is displaying in the portal");
			Reporter.log("Search icon is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}

	public boolean verifyUserLogin_icon_in_Headermenu() {
		WebElement UserLoginIcon = driver.findElement(By.className("user-login"));
		if (UserLoginIcon.isDisplayed()) {
			System.out.println(" User login icon is displaying in the portal");
			Reporter.log("User login logo is displaying and it is clickable in the portal");
			return true;
		} else
			return false;
	}
}
