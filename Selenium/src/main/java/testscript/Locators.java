package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public static void main(String[] args) {
		Locators loctr=new Locators();
		//loctr.InitialiseBrowser();
		loctr.idLocator();

	}
	public void idLocator()
	{
		WebElement messagetext=driver.findElement(By.id("single-input-field"));
		WebElement entervalue1=driver.findElement(By.id("value-a"));
		WebElement entervalue2=driver.findElement(By.id("value-b"));
		WebElement gettotal_btn=driver.findElement(By.id("button-two"));
		
	
	}
	public void nameLocator()
	{
		WebElement name=driver.findElement(By.name("viewport"));	
	}
	public void classLocator()
	{
		WebElement header=driver.findElement(By.className("header-top"));	
	}
	public void cssSelectorLocator()//Combination of tag#id
	{
		WebElement css=driver.findElement(By.cssSelector("input#single-input-field"));	
		//Combination of tag.class
		WebElement css1=driver.findElement(By.cssSelector("ul.navbar-nav"));	
		//Combination of tag[attribute=value]
		WebElement css2=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		//Combination of tag.class[attribute=value]
		WebElement css3=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
		
	}
	
	public void relativeXpath()
	{
	WebElement relative=driver.findElement(By.xpath("//input[@placeholder='Message']"));
	}
	public void contains_Xpath()
	{
		//tagname[contains(@attributetype,'value')]
	WebElement contain=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	}
	
	public void text_Xpath()
	{
		//tagname[text()='value']
	WebElement text=driver.findElement(By.xpath("//button[text()='Show Message')]"));
	}
	public void axes()
	{
		//tagname[@attributetype='value']//parent::tagname
		WebElement ax=driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		//tagname[@attributetype='value']//child::tagname[@attributetype='value']
		WebElement ax2=driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']"));
	}

	
		
}
