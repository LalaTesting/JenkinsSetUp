package Voot.smac.pages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VootLoginPageTest  extends BaseClass
{

	
	@Test
	public void verifyLoginScreeen() throws InterruptedException{
		Assert.assertTrue(loginpage.vootLogopreaset());
		Assert.assertTrue(loginpage.verifyUseEmailMessage());
		Assert.assertTrue(loginpage.verifyEmailAddressInputField("ravindra.parauha100@gmail.com"));;
		Assert.assertTrue(loginpage.verifyRegesterButtonOnLoginPage());
		Assert.assertTrue(loginpage.verifyLoginButtonOnLoginPage());
		Assert.assertTrue(loginpage.verify_Login_Text_On_LoginPage());
		Assert.assertTrue(loginpage.verify_Login_with_facebook_Button());
		Assert.assertTrue(loginpage.verify_Login_with_Google_Button());
		
		
	}
}
