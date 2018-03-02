package Voot.smac.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class ShowsPages {

	WebDriver driver;
	WebElement showlink, featuredList,kids;
	HomaPage_Voot_Application homepage=new HomaPage_Voot_Application(driver);
	
	public ShowsPages(WebDriver driver) {
		this.driver = driver;
	}

	public boolean clickShowsLinkinheader() throws InterruptedException 
	{
		showlink = driver.findElement(By.id("shows_dropbtn"));
		homepage.highLighterMethod(driver, showlink);

		if (showlink.isDisplayed())
		{
			System.out.println("show link is present in the homegage");

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
			
			List<WebElement> Allshowsmenu= driver.findElements(By.xpath("//div[@id='All Shows']/a"));

			System.out.println("========displayed showsNames in Allshowsmenu section ======");
			System.out.println(Allshowsmenu.size());
		
	     for (WebElement vootAllShow : Allshowsmenu) {
				
				if(vootAllShow.getText().contains("2MAD")){
					
				System.out.println(vootAllShow.getText());
				Thread.sleep(1000);
				vootAllShow.click();
				Thread.sleep(1000);
				System.out.println("after click on the show current url is "+driver.getCurrentUrl());
			}
			}
		
			Thread.sleep(3000);
			return true;
		} else
			return false;
	}
	public boolean clickKidsMenuLinkinheader() throws InterruptedException
	{
		kids=driver.findElement(By.xpath("//div[@class='dropdown']/a[@id='kids_dropbtn']"));
		homepage.highLighterMethod(driver, kids);
		System.out.println("Header Kids Text is::::::::::::"+kids.getText());
		Thread.sleep(3000);
		if(kids.isDisplayed()){
			kids.click();
			Thread.sleep(3000);
			return true;
		}
			else return false;
		}
	}

