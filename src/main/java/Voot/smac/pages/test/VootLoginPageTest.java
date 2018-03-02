package Voot.smac.pages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VootLoginPageTest  extends BaseClass
{

	
	@Test
	public void verifyLoginScreeen() throws InterruptedException{
		Assert.assertTrue(loginpage.vootLogopreaset());
		Assert.assertTrue(loginpage.verifyUseEmailMessage());
		
	}
}
