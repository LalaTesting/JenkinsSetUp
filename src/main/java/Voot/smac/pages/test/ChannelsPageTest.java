package Voot.smac.pages.test;

import org.testng.annotations.Test;



public class ChannelsPageTest extends BaseClass {

     
	@Test(priority=1,description ="Verify list overlay is displayed when user mousehover on 'Channels' in the header menu of  'Homepage'.")
	public void mousehover_ChannelsInHeaderMenuOfHomepage() throws InterruptedException{
		extentTest = extent.startTest("Verify list overlay is displayed when user mousehover on 'Channels' in the header menu of  'Homepage'.");
		channelpage.verifyClannelListOverlayisDisplayed();	
	}
	
	
	@Test(priority=2,description ="Verify whether user is able to view all the elements present in Channels overlay.")
	public void OverlaywithListofchannels() throws InterruptedException{
		extentTest = extent.startTest("Verify whether user is able to view all the elements present in Channels overlay");
		channelpage.viewAlltheEChannelNamePresentinChannelsOverlay();
	}
	
	@Test(priority=3,description ="Verify whether user is able to navigate to Channel details page when clicked on any Channel(Logo) in channel overlay.")
	public void Clickonanychannel() throws InterruptedException{
		extentTest = extent.startTest("Verify whether user is able to navigate to Channel details page when clicked on any Channel(Logo) in channel overlay..");
		channelpage.clickedAnyChannelInChannelOverlay();
	}
	
	@Test(priority=4,description ="Verify whether user is able to view all details present in Channel details page.")
	public void navigateToChannelDetailsPage() throws InterruptedException{
		extentTest = extent.startTest("Verify whether user is able to view all details present in Channel details page.");
		channelpage.verifyweatherUserisnavigatedToChannellandingPage();
	}
}
