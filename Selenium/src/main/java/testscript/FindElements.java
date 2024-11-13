package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base{

	public static void main(String[] args) {
		FindElements elements=new FindElements();
	    elements.InitialiseBrowser();
	    elements.FindElemnt();

	}
	public void FindElemnt()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> msg=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement message:msg)
		{
			message.sendKeys("Hello");
		}
	}

}
