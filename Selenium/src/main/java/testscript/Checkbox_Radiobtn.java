package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox_Radiobtn extends Base {

	public static void main(String[] args) {
		Checkbox_Radiobtn check=new Checkbox_Radiobtn();
		check.InitialiseBrowser();
		check.Checkbox();
		check.Radiobtn();
		check.TextEnabled();
				

	}
	public void Checkbox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbx=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//checkbx.click();
		System.out.println(checkbx.isSelected());
	}
	public void Radiobtn()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		//WebElement radio=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		//radio.click();
		
			//System.out.println("The gender is: Male "+radio.isEnabled());
		
			WebElement radio2=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
			radio2.click();
			System.out.println("The gender is: Female "+radio2.isEnabled());
			
		
	}
	public void TextEnabled()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement txt_enable=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		if(txt_enable.isSelected()==true)
		{
			System.out.println("The textbox is enabled");
		}
		else
		{
			System.out.println("The textbox is disabled");
		}
	}

}
