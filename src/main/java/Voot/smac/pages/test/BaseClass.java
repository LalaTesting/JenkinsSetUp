package Voot.smac.pages.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import Voot.smac.pages.HomaPage_Voot_Application;
import Voot.smac.pages.ShowsPages;

public class BaseClass {
	public WebDriver driver;
	public HomaPage_Voot_Application homepage;
	public ShowsPages showpage;
	// Just  i am adding authour in our code

	@Parameters({ "browsers" })
	@BeforeClass
	public void setBrowsers(String browsers) {
		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","F:/Mozilla gecko/geckodriver-v0.19.1-win64 (1)/geckodriver.exe"
		 * ); driver=new FirefoxDriver(); driver.get("https://alpha.voot.com/");
		 */
		// public void setBrowsers(String browsers){

		if (browsers.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ravindra.parauha\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browsers.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\chromedriver_win32 (1)\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	
		driver.get("https://alpha.voot.com/");
		System.out.println("user has provided the Application URL");
		driver.manage().window().maximize();
		System.out.println("user has maximize the browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		homepage = new HomaPage_Voot_Application(driver);
		
		showpage=new ShowsPages(driver);
	}

	@AfterClass
	public void closebrowser() {
		driver.close();
		driver.quit();
	}
}

