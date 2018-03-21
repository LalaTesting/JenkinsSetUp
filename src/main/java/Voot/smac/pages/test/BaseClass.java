package Voot.smac.pages.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utilspackage.com.GenericFunctions;
import Voot.smac.pages.ClannelsPage;
import Voot.smac.pages.HomaPage_Voot_Application;
import Voot.smac.pages.MoviesPage;
import Voot.smac.pages.SearchPage;
import Voot.smac.pages.ShowsPages;
import Voot.smac.pages.VootLoginPage;

public class BaseClass
{
	//WebDriver instance 
	public WebDriver driver;
	
	//Extent Reports 

     // All Classes Instance variable
	public HomaPage_Voot_Application homepage;
	public ShowsPages showpage;
	public VootLoginPage loginpage;
	public GenericFunctions functios;
	public ClannelsPage channelpage;
	public MoviesPage moviepage;
	public SearchPage searchpage;
    public ExtentReports extent;
	public ExtentTest extentTest;

	
	
	@BeforeClass
	public void setExtent(){
		extent = new ExtentReports("E:\\for Android native app which used for testobject\\voot\\VootWebextentReports\\VootResult.html", false);
		extent.addSystemInfo("Host Name", "vdc01dllap0284 ");
		extent.addSystemInfo("User Name", "ravindra.parauha ");
		extent.addSystemInfo("Environment", "Voot QA");
		
	}
@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}
	@Parameters({ "browsers" })
	@BeforeMethod
	public void setBrowsers(String browsers) {
		if (browsers.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ravindra.parauha\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		}

		else if (browsers.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\for Android native app which used for testobject\\voot\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.get("https://alpha.voot.com/");
		System.out.println("Open the browser,enter the URL,press 'Enter' and navigate to Homepage.");
		driver.manage().window().maximize();
		System.out.println("user has maximize the browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		homepage = new HomaPage_Voot_Application(driver);

		showpage = new ShowsPages(driver);

		loginpage = new VootLoginPage(driver);

		functios = new GenericFunctions(driver);
		
		channelpage=new ClannelsPage(driver);
		
		moviepage=new MoviesPage(driver);
		
		searchpage= new SearchPage(driver);
	}



	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException, InterruptedException{
		
	if(result.getStatus()==ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			//String screenshotPath = BaseClass.getScreenshot(driver, result.getName());
		//	extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
			//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
		}
		else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}
		
		
		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
		functios.sleepMode(1000);
		driver.quit();
	}
}
	
	
	
	
/*	
	@Parameters({ "browsers" })
	
	@BeforeClass
	public void setBrowsers(String browsers) {
		
		 * System.setProperty(
		 * "webdriver.gecko.driver","F:/Mozilla gecko/geckodriver-v0.19.1-win64 (1)/geckodriver.exe"
		 * ); driver=new FirefoxDriver(); driver.get("https://alpha.voot.com/");
		 
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
		System.out.println("Open the browser,enter the URL,press 'Enter' and navigate to Homepage.");
		driver.manage().window().maximize();
		System.out.println("user has maximize the browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		homepage = new HomaPage_Voot_Application(driver);

		showpage = new ShowsPages(driver);

		loginpage = new VootLoginPage(driver);

		functios = new GenericFunctions(driver);
		
		channelpage=new ClannelsPage(driver);
		
		moviepage=new MoviesPage(driver);
		
		searchpage= new SearchPage(driver);
	}

	@AfterClass
	public void closebrowser() {
		driver.close();
		driver.quit();
	}
	
	}
*/
