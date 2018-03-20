package Voot.smac.pages.test;

import org.testng.annotations.Test;

import Utilspackage.com.TestData;

public class SearchPageTest  extends BaseClass{
	
	TestData data=new TestData();
	
	
	@Test(priority=1,description="Verify  Search Icon in Home Page screen")
	public void verify_Search_Icon_In_HomePage() throws InterruptedException{
		extentTest = extent.startTest("Verify  Search Icon in Home Page screen");
		searchpage.verifySearchIconInHomePage();
	}
	
	
	@Test(priority=2,description="Verify  Search Icon in search Page screen")
	public void verify_Search_Icon_In_SearchPage() throws InterruptedException{
		extentTest = extent.startTest("Verify  Search Icon in search Page screen");
		searchpage.verifySechIconInSeachPage();
	}
	@Test(priority=3,description="Verify  Close Icon in search Page screen")
	public void verify_Close_Icon_In_SearchPage() throws InterruptedException{
		extentTest = extent.startTest("Verify  Close Icon in search Page screen");
		searchpage.verifyeCloseIconinSearchPage();
	}
	
	@Test(priority=4,description="Verify  Search Text box  in search Page screen")
	public void verify_Search_Text_Box_In_SearchPage() throws InterruptedException{
		extentTest = extent.startTest("Verify  Search Text box  in search Page screen");
		searchpage.SearchtextBox();
	}
	
	@Test(priority=5,description="Verify  user is able to enter the Serch value in Serch text box in  search Page screen,erify  Search Result after entering  the Searchh value in  Serch text box in search Page screen")
	public void enter_Some_Value_inSide_the_Text_Box_In_SearchPage() throws InterruptedException{
		extentTest = extent.startTest("Verify  Search Text box  in search Page screen");
		searchpage.enterSomeSearchvalueandVerifyTheResult(data.MotuPatlue);
   }
}