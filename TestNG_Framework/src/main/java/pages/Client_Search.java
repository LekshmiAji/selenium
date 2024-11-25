package pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_Search {
	public WebDriver driver;
public Client_Search(WebDriver driver)
{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);//for using finddBy annotation
	
}

//@FindBy(xpath  ="//a[@href='/payrollapp/client/index']") WebElement client;
@FindBy(xpath  ="//a[text()='Clients']") WebElement client;
@FindBy(xpath="//input[@id='clientsearch-client_name']") WebElement clientname;
@FindBy(xpath="//input[@id='clientsearch-id']") WebElement clientid;
@FindBy(xpath="//button[@class='btn btn-primary']") WebElement search;
@FindBy(xpath = "//button[@class='btn btn-default']")WebElement reset;
@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td[2]")List <WebElement> columnitem;
@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td")List <WebElement> particularitem;
public void click_onclientpage()
{
	client.click();
}
	
public void enter_clientname_search() 

{
	
	 clientname.sendKeys("Haritha");
	 search.click();
		 
	
}
public void reset()
{
	clientid.clear();
	clientname.clear();
}
public void enter_clientid_search() 

{	
		 clientid.sendKeys("5");
		 search.click();
		 
	
}
public void enter_bothidandname_search()
{
	clientname.sendKeys("Haritha");
	clientid.sendKeys("5");
	 search.click();
}
public void IsSearcheditempresentintable()
{
	
	    String input = "Harithaff"; 
	    boolean found = false; 

	 
	    if (columnitem == null) {
	        System.out.println("The list of items is empty or null.");
	        return;
	    }

	    for (int i = 0; i < columnitem.size(); i++) {
	        WebElement columnsearch = columnitem.get(i);
	        String itemText = columnsearch.getText();  // Clean the item text


	        if (itemText.equalsIgnoreCase(input)) {
	            assertTrue(true, "Found: " + itemText);  
	            System.out.println("Found: " + itemText);
	            found = true;
	            break;  
	        }
	    }

	   
	    if (!found) {
	       // assertTrue(false, "Item not found: " + input);  // Log failure
	        System.out.println("Not Found: " + input);
	    }
	}

}