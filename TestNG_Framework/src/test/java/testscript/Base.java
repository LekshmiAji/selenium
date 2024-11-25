package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public WebDriver driver;
 
  @BeforeMethod
  
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	 
  }
  public void login(String username, String password) throws AWTException, InterruptedException {
      LoginPage loginPage = new LoginPage(driver);

      // Check if the user is already logged in by verifying the presence of a "Logout" button
      //if (!loginPage.isUserLoggedIn()) {
          //driver.get("https://www.qabible.in/payrollapp/site/login");
          loginPage.enter_usernamefield(username);
          loginPage.enter_passwordfield(password);
          loginPage.clickon_loginbtn();
     // }
  }
 
  @AfterMethod
  public void afterMethod() {
	// driver.quit();
  }

}
