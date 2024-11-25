package pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);//for using finddBy annotation
	
}
@FindBy(id="loginform-username") WebElement username;

@FindBy(id="loginform-password") WebElement password;
@FindBy(xpath ="//button[@class='btn btn-default']") WebElement loginbtn;
@FindBy(xpath="//a[text()='Dashboard']") WebElement dashboard;
@FindBy(xpath = "//a[text()='Logout']") WebElement logout;
public void enter_usernamefield(String usernamefield)
{
	username.sendKeys(usernamefield);	
}
public void enter_passwordfield(String passwordfield)
{
	password.sendKeys(passwordfield);	
}
public void clickon_loginbtn() throws AWTException, InterruptedException
{
	loginbtn.click();
	Robot robot=new Robot();
	robot.delay(1000);
}
public boolean isDashboardLoaded()
{
	
	//System.out.println(dashboard.isDisplayed());
	return dashboard.isDisplayed();
	
	
}


}
