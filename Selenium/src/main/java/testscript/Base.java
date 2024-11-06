package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public static void main(String[] args) {
		Base objt=new Base();
		objt.InitialiseBrowser();
		objt.QuitClose();

	}
	public void InitialiseBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		
	}
public void QuitClose()
{
	driver.close();
}
}
