package Voot.smac.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

import Utilspackage.com.ApplicationData;
import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class ShowsPages extends Uielements {

	WebDriver driver;
	WebElement showlink, featuredList, kids, most_watched_show;
	HomaPage_Voot_Application homepage = new HomaPage_Voot_Application(driver);
	GenericFunctions functios = new GenericFunctions(driver);
	ApplicationData appdata = new ApplicationData();

	public ShowsPages(WebDriver driver) {
		this.driver = driver;
	}

	public boolean clickShowsLinkinheader() throws InterruptedException {
		showlink = driver.findElement(By.id("shows_dropbtn"));
		functios.highLighterMethod(driver, showlink);

		if (showlink.isDisplayed()) {
			System.out.println("Mouse hover on 'Shows' in the header and verify");
			Reporter.log("show link is present in home page");
			String sholink = showlink.getAttribute("href");
			System.out.println("show link is :::::" + sholink);
			Actions act = new Actions(driver);
			act.moveToElement(showlink).build().perform();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<WebElement> featuredlist = driver.findElements(By.xpath("//div[@id='Featured Shows']"));

			for (WebElement ele : featuredlist) {
				System.out.println("------::::::::::::::::::::::-------------------");
				System.out.println("===========shows are displayed in featured section===========");
				System.out.println(ele.getText());

			}

			List<WebElement> showsVootOriginal = driver.findElements(By.xpath("//div[@id='Voot Originals']"));
			for (WebElement vootoriginal : showsVootOriginal) {
				System.out.println("========displayed voot original shows======");
				System.out.println(vootoriginal.getText());

			}

			List<WebElement> showsLanguages = driver.findElements(By.xpath("//div[@id='Languages']"));

			for (WebElement vootlanguage : showsLanguages) {
				System.out.println("========displayed Languages in language section ======");
				System.out.println(vootlanguage.getText());

			}

			List<WebElement> showsGenera = driver.findElements(By.id("Genres"));

			for (WebElement vootShowGenera : showsGenera) {
				System.out.println("========displayed showsNames in Genera section ======");
				System.out.println(vootShowGenera.getText());

			}
			Thread.sleep(3000);

			List<WebElement> Allshowsmenu = driver.findElements(By.xpath("//div[@id='All Shows']/a"));

			System.out.println("========displayed showsNames in Allshowsmenu section ======");
			System.out.println(Allshowsmenu.size());

			for (WebElement vootAllShow : Allshowsmenu) {
				System.out.println(vootAllShow.getText());

				functios.sleepMode(3000);
				if (vootAllShow.getText().contains("2MAD")) {
					// System.out.println(vootAllShow.getText());
					vootAllShow.click();
					functios.sleepMode(3000);
					System.out.println("after click on the show current url is " + driver.getCurrentUrl());
					String actualshowtitle = driver.getTitle();
					System.out.println(
							"Verify after click on the show what is the title ::::::::::::::::::: " + actualshowtitle);
					Assert.assertEquals(actualshowtitle, appdata.Show_title_is);

					//functios.scrollDown(driver);
				/*	most_watched_show = driver.findElement(By.xpath(More_button_mostwatchshow_xpath));
					functios.explicitlyWaitCondition(driver, 20, most_watched_show);
					functios.clickElement(driver, most_watched_show);
					Thread.sleep(5000);*/

				}
			}

			return true;
		} else
			return false;
	}

	public boolean clickKidsMenuLinkinheader() throws InterruptedException {
		kids = driver.findElement(By.id(Kids_menu_id));
		functios.highLighterMethod(driver, kids);
		System.out.println(" Kids Text value in header sction is::::::::::::" + kids.getText());
		Thread.sleep(2000);
		if (kids.isDisplayed()) {
			functios.clickElement(driver, kids);
			functios.sleepMode(2000);
			System.out.println(
					"When user click on the Kids tabs the  Url should be  is:::::::::::: " + driver.getCurrentUrl());

			System.out.println("Kids Title should be displayed ::::::::::::::: " + driver.getTitle());
			Thread.sleep(3000);
			return true;
		} else
			return false;
	}
}
