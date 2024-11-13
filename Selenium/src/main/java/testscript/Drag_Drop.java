package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop extends Base{

	public static void main(String[] args) {

		Drag_Drop dragdrop=new Drag_Drop();
		dragdrop.InitialiseBrowser();
		dragdrop.DragDrop();

	}
	public void DragDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action=new Actions(driver);
		action.moveToElement(drag1);
		action.doubleClick(drag1).perform();
		WebElement destination=driver.findElement(By.id("//div[@id='mydropzone']"));
				action.dragAndDrop(drag1, destination).build().perform();
	}

}
