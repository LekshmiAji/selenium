package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public WebDriver driver;
	public static void main(String[] args) {
		
		Frames_Example frm=new Frames_Example();
		frm.frame();


	}
	public void frame()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement jmetr=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmetr.click();
	}

}
