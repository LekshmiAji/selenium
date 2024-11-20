package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public WebDriver driver;
	public static void main(String[] args) throws AWTException {
		
		FileUpload file=new FileUpload();
		//file.ToUpload_File();
		file.SendKeys_Example();


	}
public void ToUpload_File() throws AWTException
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
	selectpdf.click();
	StringSelection select=new StringSelection("C:\\Users\\User\\Desktop\\Selenium\\circles worksheet.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
	Robot robot=new Robot();
	robot.delay(1000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
public void SendKeys_Example()
{
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.manage().window().maximize();
	WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
	//selectpdf.click();
	selectpdf.sendKeys("C:\\Users\\User\\Desktop\\Selenium\\circles worksheet.pdf");
	
}
}
