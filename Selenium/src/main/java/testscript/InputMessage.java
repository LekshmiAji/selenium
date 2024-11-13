package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMessage extends Base {

	public static void main(String[] args) {

		InputMessage inputshow=new InputMessage();
		inputshow.InitialiseBrowser();
		inputshow.input_Message();

	}
	public void input_Message()
	{
		WebElement input=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		input.click();
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Welcome");
		WebElement click_Showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		click_Showmessage.click();
		WebElement value1=driver.findElement(By.xpath("//input[@id='value-a']"));
		value1.sendKeys("23");
		WebElement value2=driver.findElement(By.xpath("//input[@id='value-b']"));
		value2.sendKeys("45");
		WebElement get_total=driver.findElement(By.xpath("//button[@id='button-two']"));
		get_total.click();
		
		

		
	}

}
