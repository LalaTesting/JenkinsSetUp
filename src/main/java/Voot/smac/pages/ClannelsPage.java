package Voot.smac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utilspackage.com.ApplicationData;
import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class ClannelsPage extends Uielements
{

	WebDriver driver;
	WebElement channelsmenu,channelsOverlay,listOfChannels,channelDeatilsPage;
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
	
	
	public void viewAlltheEChannelNamePresentinChannelsOverlay() throws InterruptedException{
		List<WebElement>listOfChannels=driver.findElements(By.xpath(channelsList_withNamexpath));
		for(WebElement channelaname : listOfChannels){
			System.out.println("Overlay with List of channels and channel name is ++++++++++::::::::::"   +channelaname.getText());
			function.sleepMode(3000);
		}
		
	}
	
	public void clickedAnyChannelInChannelOverlay() throws InterruptedException{
		verifyClannelListOverlayisDisplayed();
		List<WebElement>listOfChannels=driver.findElements(By.xpath(channelsList_withNamexpath));
		
		for(WebElement channelaname : listOfChannels)
		{
			if(channelaname.getText().contains("Colors Tamil"))
			{
				channelaname.click();
				System.out.println("Clicked on color Tamil channel ");
				function.sleepMode(3000);
				
				
			}
		}
	}
	
	public boolean verifyweatherUserisnavigatedToChannellandingPage() throws InterruptedException
	{
		channelDeatilsPage=driver.findElement(By.xpath(channelslandingbreadcumbs_xpath));
		function.highLighterMethod(driver, channelDeatilsPage);
		System.out.println("User should be able to view -Bread crumbs(For ex: Home> Channels)  for navigation of channel landing page.");
		if(channelDeatilsPage.isDisplayed()){
			System.out.println("Verify Title of the page ");
			String actualTitle=driver.getTitle();
			System.out.println("User should be to navigated to Channel details page and verify the title of the page::::++++++++++++:: ::::::::::"+actualTitle);
			Assert.assertEquals(actualTitle, ApplicationData.channelsTitle);
           String currenturlofthePage= driver.getCurrentUrl();
           System.out.println("Current Url is::::::::::::+++++++++++:::::::::    "+currenturlofthePage);
           
           return true;
		}
		else return false;
		
	}
}

