package Voot.smac.pages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShowPagesTest extends BaseClass {
	
	@Test(priority =1,description="Verify weather user is able to click on the show link on the header or not if yes verify all the show name in side the show menu")
	public void clickedshowlink() throws InterruptedException{
	Assert.assertTrue(showpage.clickShowsLinkinheader());
		
	}
	
	
	//@Test(priority =2,description="Verify weather user is able to click on the kids link on the header")
	public void clickedkidslink() throws InterruptedException {
		Assert.assertTrue(showpage.clickKidsMenuLinkinheader());
	
	}
}
