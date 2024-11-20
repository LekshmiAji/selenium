package testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Window_Handle {

	public WebDriver driver;
	public static void main(String[] args) {

		Multi_Window_Handle window=new Multi_Window_Handle();
		window.window_handling();

	}

	public void window_handling()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		
		WebElement Loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		Loginportal.click();
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window is " +parent);
		Set<String> allWindow=driver.getWindowHandles();
		String title="";
		
		//System.out.println("Child Window is "+allWindow);
		for(String temp:allWindow)
		{
			if(!temp.equals(parent))
			{
				System.out.println("Except parent from child Windows "+temp);
				driver.switchTo().window(temp);
				//System.out.println(driver.getTitle());
				title=driver.getTitle();
			}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement Username=driver.findElement(By.xpath("//input[@id='text']"));
				Username.click();
				WebElement Usernametext=driver.findElement(By.xpath("//input[@id='text']"));
				Usernametext.sendKeys("Myname");
				WebElement passwrd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
				passwrd.sendKeys("Myname123");
				WebElement login=driver.findElement(By.xpath("//button[@id='login-button']"));
				login.click();
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				firstname.sendKeys("Lekshmi");
				WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastname.sendKeys("M S");
			}
			
		}
		
	}
}
