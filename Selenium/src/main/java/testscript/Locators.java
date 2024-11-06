package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public static void main(String[] args) {
		Locators loctr=new Locators();
		loctr.InitialiseBrowser();
		loctr.idLocator();

	}
	public void idLocator()
	{
		WebElement messagetext=driver.findElement(By.id("single-input-field"));
		WebElement entervalue1=driver.findElement(By.id("value-a"));
		WebElement entervalue2=driver.findElement(By.id("value-b"));
		WebElement gettotal_btn=driver.findElement(By.id("button-two"));
	
	}

}
