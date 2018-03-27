package Voot.smac.pages.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Utilspackage.com.TestData;

public class VootLoginPageTest  extends BaseClass
{
TestData data=new TestData();
	
	@Test(priority=1,description="Verify  whether login popup is displayed when user click on profile avatar in Homepage before logging in to application.")
	public void verifyLoginScreeen() throws InterruptedException{
		extentTest = extent.startTest(" Verify  whether login popup is displaying with all the content  when user click on profile avatar in Homepage before logging in to application.");
		Assert.assertTrue(loginpage.vootLogopreaset());
		Reporter.log("Voot login icon is present",true);
		Assert.assertTrue(loginpage.verifyUseEmailMessage());
		Assert.assertTrue(loginpage.verifyEmailAddressInputField());;
		Assert.assertTrue(loginpage.verifyRegesterButtonOnLoginPage());
		Assert.assertTrue(loginpage.verifyLoginButtonOnLoginPage());
		Assert.assertTrue(loginpage.verify_Login_Text_On_LoginPage());
		Assert.assertTrue(loginpage.verify_Login_with_facebook_Button());
		Assert.assertTrue(loginpage.verify_Login_with_Google_Button());
		Assert.assertTrue(loginpage.closeIcon());
		
	}
	
	
	@Test(priority=2,description="Verification of Login PopUp in Voot Application")
	public void EnterbankEmailidandverifyerrormessage() throws InterruptedException{
		extentTest = extent.startTest("Verification of Login PopUp in Voot Application");
		loginpage.vootLogopreaset();
		loginpage.enterwithoutInputverifyEmailAddressInputField("");
	    loginpage.verify_Error_message_without_EnteringEmail();
	}
	
	
	
	@Test(priority=3,description="verify valid email id in Login PopUp in Voot Application")
	public void enter_valid_Email_In_input_Text_field() throws InterruptedException{
		extentTest = extent.startTest("verify valid email id in Login PopUp in Voot Application");
		loginpage.vootLogopreaset();
		Assert.assertTrue(loginpage.enter_Emailid_Address_in_InputField(data.validemailId));;
	}
}
