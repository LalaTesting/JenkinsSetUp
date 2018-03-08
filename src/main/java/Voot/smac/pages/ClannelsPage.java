package Voot.smac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class ClannelsPage extends Uielements
{

	WebDriver driver;
	WebElement channelsmenu,channelsOverlay ;
	GenericFunctions function=new GenericFunctions(driver);
	
	public ClannelsPage(WebDriver driver ){
		this .driver=driver;
	}
	
	public boolean verifyClannelListOverlayisDisplayed() throws InterruptedException
	{
	channelsmenu	=driver .findElement(By.id(channels_id));
	 function.highLighterMethod(driver, channelsmenu);
	channelsOverlay =driver .findElement(By.xpath(channelsOverlay_xpath));
	if(channelsmenu.isDisplayed()){
	function.mouseOverAction(driver, channelsmenu);
	System.out.println(" user mousehover on 'Channels' in the header menu of  'Homepage'.");
	Reporter.log( "user mousehover on 'Channels' in the header menu of  'Homepage'");   
	   {
   	        if (channelsOverlay.isDisplayed())
   	        {
		          function.highLighterMethod(driver, channelsOverlay);
		           System.out.println("Overlay list should be displayed and list should contain all the channels");
   	        }
	   }
	return true;
	}
	else return false;
	}
}


