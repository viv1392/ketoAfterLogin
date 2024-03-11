package afterLoginTest;

import org.testng.annotations.Test;

import afterLoginSkins.LoginPage;
import afterLoginSkins.WaterUpdate;
import baseTest.BaseTest;

public class AfterLoginTest extends BaseTest{
	LoginPage loginPage;
	WaterUpdate waterUpdate;
	
   @Test
	public void updateTest() throws InterruptedException {
	 loginPage= landingPage.loginMember();
	 waterUpdate= loginPage.login("virpp@yopmail.com", "1234567");
	 waterUpdate.Add500ml();
	}
}
