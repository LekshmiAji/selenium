package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.LoginPage;

public class LoginPage_Test extends Base {
  @Test(priority = 0)
  public void verifyUserIsAbleToLoginValidCredentials() throws AWTException, InterruptedException {
	  LoginPage login=new LoginPage(driver);
	  login("carol", "1q2w3e4r");
	  //login.enter_usernamefield("carol");
	  //login.enter_passwordfield("1q2w3e4r");
	  //login.clickon_loginbtn();
	   boolean isHomepageisloaded=login.isDashboardLoaded();
	  assertTrue(isHomepageisloaded, "Home page is not loaded");
	  
  }
  
}
