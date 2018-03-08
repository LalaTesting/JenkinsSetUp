package Voot.smac.pages.test;

import org.testng.annotations.Test;

public class ChannelsPageTest extends BaseClass {

	@Test(priority=1,description ="Verify list overlay is displayed when user mousehover on 'Channels' in the header menu of  'Homepage'.")
	public void mousehover_ChannelsInHeaderMenuOfHomepage() throws InterruptedException{
		channelpage.verifyClannelListOverlayisDisplayed();	
	}
	
}
