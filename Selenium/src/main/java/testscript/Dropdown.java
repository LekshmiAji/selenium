package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Base {

	public static void main(String[] args) {
		
		Dropdown dropdwnselection=new Dropdown();
		dropdwnselection.InitialiseBrowser();
		dropdwnselection.Dropdown_Select();
	}
	
	public void Dropdown_Select()
	{
		/*WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement selectinput=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		selectinput.click();*/
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectdrop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		//selectdrop.click();
		//Select is  a class and we need to create object for it and pass the dropdown.
		
		Select drop=new Select(selectdrop);
		//drop.selectByVisibleText("Yellow");
		drop.selectByIndex(3);
		//drop.selectByValue("Red");
		
		
	}

}
