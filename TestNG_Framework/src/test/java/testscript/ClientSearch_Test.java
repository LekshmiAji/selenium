package testscript;


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.Client_Search;
import pages.LoginPage;



public class ClientSearch_Test extends LoginPage_Test{

	@Test(priority = 1)

  public void verifyUsingClientID_Clientname_Search() throws InterruptedException, AWTException   
	{
		//LoginPage login=new LoginPage(driver);
		login("carol", "1q2w3e4r");
	Client_Search search=new Client_Search(driver);
   
	search.click_onclientpage();
	//driver.get("https://www.qabible.in/payrollapp/client/index");
	String currentUrl = driver.getCurrentUrl();
    assertTrue(currentUrl.contains("client/index"), "Failed to navigate to the client page.");
    search.enter_clientid_search();
  search.reset();
  Robot robot=new Robot();
  robot.delay(1000);
    search.enter_clientname_search();
    search.reset();
    robot.delay(1000);
    search.enter_bothidandname_search();
    search.reset();
    search.IsSearcheditempresentintable();
	
	}
	  
	




}
