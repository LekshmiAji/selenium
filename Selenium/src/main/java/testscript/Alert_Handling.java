package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert_Handling extends Base {

	//public WebDriver driver;
	public static void main(String[] args) { 
		Alert_Handling alerthandle=new Alert_Handling();
		alerthandle.InitialiseBrowser();
		alerthandle.alert();
		alerthandle.alert_confirm();
		alerthandle.alert_clickforprompt();
		
	}
	public void alert()
	{
		
		WebElement alertclick=driver.findElement(By.xpath("//a[@id='alert-modal']"));
		alertclick.click();
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickelement=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickelement.click();
		driver.switchTo().alert().accept();
		
	}
	public void alert_confirm()
	{
		WebElement confrm_click=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		confrm_click.click();
		driver.switchTo().alert().dismiss();
	}
	public void alert_clickforprompt()
	{
		WebElement prompt=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		prompt.click();
		driver.switchTo().alert().sendKeys("Halo");
		driver.switchTo().alert().accept();
		System.out.println(prompt.isDisplayed());
	}

	
}
