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
	WebElement moviesMenu	,moviesOverLay,popularHindimoviemenu,popularMoviesNames ;
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
		
	List<WebElement>popularMoviesNames=driver.findElements(By.xpath(popularmovieValue_xpath));
	 System.out.println("popular hindi movies Value  is ");
	     for(WebElement element : popularMoviesNames )
	    	
	    		System.out.println(element.getText());
	
	}
			
			
	
	
	
}

