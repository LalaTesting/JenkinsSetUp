package Voot.smac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class MoviesPage extends Uielements
{
	WebDriver driver;
	WebElement moviesMenu	,moviesOverLay,popularHindimoviemenu,popularMoviesNames
	,popularkannadamoviesMenu,popularkannadamoviemenulist,popularBangalimoviemenulist,popularKidsmoviemenulist,popularkannadamoviemenu ;
	GenericFunctions function=new GenericFunctions(driver);
	public MoviesPage(WebDriver driver ){
		this .driver=driver;
	}
	
	public boolean mouseHoveronMoviesmenuOnHeader() throws InterruptedException{
	moviesMenu	=driver .findElement(By.id(Movies_id));
	function.highLighterMethod(driver, moviesMenu);
	if(moviesMenu.isDisplayed()){
		function.mouseOverAction(driver, moviesMenu);
		System.out.println("user mousehover on movies in the header menu of  'Homepage'.");
		Reporter.log("user mousehover on movies in the header menu of  'Homepage'.");
		function.sleepMode(2000);
		moviesOverLay=	driver .findElement(By.id(Moviesoverlayid));
		function.highLighterMethod(driver, moviesOverLay);
		System.out.println("Overlay list should be displayed and list should contain all the movies");
		Reporter.log("Overlay list should be displayed and list should contain all the movies");
		function.sleepMode(9000);
		return true;
	}
	else return false;
	}
	
	public void  verifyPapularHindiMovie() throws InterruptedException{
		moviesMenu	=driver .findElement(By.id(Movies_id));
		function.mouseOverAction(driver, moviesMenu);
		function.sleepMode(9000);
		popularHindimoviemenu=driver.findElement(By.xpath(popularHindiMovie_xpath));
		function.highLighterMethod(driver, popularHindimoviemenu);
		function.sleepMode(8000);
		System.out.println("popular hindi movies Menu is displaying inside the movies Section");
		Reporter.log("popular hindi movies Menu is displaying inside the movies Section");
		
	List<WebElement>popularHindiMoviesNames=driver.findElements(By.xpath(popularmovieValue_xpath));
	System.out.println("Total Hindimovies is::::::::::::::::++++++++++++++::::::::::::::::"  +popularHindiMoviesNames.size());
	 System.out.println("popular hindi movies Value  is :----------------------------------------------------------------");
	 System.out.println(" ");
	     for(WebElement element : popularHindiMoviesNames )
	    	
	    		System.out.println(element.getText());
	
	}


	public void  verifyPapularKannadaMovie() throws InterruptedException{
		moviesMenu	=driver .findElement(By.id(Movies_id));
		function.mouseOverAction(driver, moviesMenu);
		function.sleepMode(9000);
		popularkannadamoviemenu=driver.findElement(By.xpath(popularkannadamovie_xpath));
		function.highLighterMethod(driver, popularkannadamoviemenu);
		function.sleepMode(8000);
		System.out.println("popular kannada movies is displaying inside the movies Section");
		Reporter.log("popular kannada movies Menu is displaying inside the movies Section");
		
	List<WebElement>popularkannadaMoviesNames=driver.findElements(By.xpath(popularkannadamovielist_xpath));
	System.out.println("Total Kannada movies is:::::::::::::::::::::::::::++++++++++++++++++:::::::::::::::" +popularkannadaMoviesNames.size());
	 System.out.println("popular kannada movies Value  is :-------------------------------------------------------------");
	 System.out.println(" ");
	     for(WebElement element : popularkannadaMoviesNames )
	    	
	    		System.out.println(element.getText());
	
	}
	public void  verifyPapularBangaliMovie() throws InterruptedException{
		moviesMenu	=driver .findElement(By.id(Movies_id));
		function.mouseOverAction(driver, moviesMenu);
		function.sleepMode(9000);
		popularBangalimoviemenulist=driver.findElement(By.xpath(popularBangalimovie_xpath));
		function.highLighterMethod(driver, popularBangalimoviemenulist);
		function.sleepMode(8000);
		System.out.println("popular Bangali movies is displaying inside the movies Section");
		Reporter.log("popular Bangali movies Menu is displaying inside the movies Section");
		
	List<WebElement>popularBangaliMoviesNames=driver.findElements(By.xpath(popularBangalimovielist_xpath));
	
	System.out.println("Total Bangali movies is::::::::::::::::++++++++++++++++++::::::::::::::::::::::::::::::::::::"  +popularBangaliMoviesNames.size());
	 System.out.println("popular Bangali movies Value  is :+----------------------------------------------------------------");
	 System.out.println(" ");
	     for(WebElement element : popularBangaliMoviesNames )
	    	
	    		System.out.println(element.getText());
	
	}
	
	public void  verifyPapularKidsMovie() throws InterruptedException{
		moviesMenu	=driver .findElement(By.id(Movies_id));
		function.mouseOverAction(driver, moviesMenu);
		function.sleepMode(9000);
		popularKidsmoviemenulist=driver.findElement(By.xpath( popularKidsmovie_xpath));
		function.highLighterMethod(driver, popularKidsmoviemenulist);
		function.sleepMode(8000);
		System.out.println("popular Kids movies is displaying inside the movies Section");
		Reporter.log("popular Kids movies Menu is displaying inside the movies Section");
		
	List<WebElement>popularKidsMoviesNames=driver.findElements(By.xpath(popularKidsmovielist_xpath));
	System.out.println("Total Kids movies is::::::::::::::::+++++++++++++++::::::::::::::::::::::::::::::::::::::::"  +popularKidsMoviesNames.size());
	 System.out.println("popular kids movies Value  is:----------------------------------------------------------- ");
	 System.out.println(" ");
	     for(WebElement element : popularKidsMoviesNames )
	    	
	    		System.out.println(element.getText());
	
	}
}

