package testscript;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Table_Handling extends Base {

	public static void main(String[] args) {

		Table_Handling tablehandle=new Table_Handling();
		tablehandle.InitialiseBrowser();
		tablehandle.Full_Table();
		System.out.println("*********************");
		tablehandle.Table_Row();
		System.out.println("##############################");
		tablehandle.Select_ParticularElement();
		System.out.println("##############################");
		tablehandle.Search_ParticularElement();
		System.out.println(".....................................................");
		tablehandle.ParticularColumn();
		System.out.println(".........................***********............................");
		tablehandle.Search_ParticularColumnitem();

	}
	public void Full_Table()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
		
	}
public void Table_Row()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
	System.out.println(row.getText());
}
public void Select_ParticularElement()
{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement tabledata=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
	System.out.println(tabledata.getText());
}

public void Search_ParticularElement()
{
String input="Tiger Nixon";
List<WebElement> particularelmt=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
for(WebElement elemnt:particularelmt)
{
	if(elemnt.getText().equals(input))
	{
		System.out.println("Element is present  "+elemnt.getText());
	}
	
}
}
public void ParticularColumn()
{
	List<WebElement> column=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
	for(WebElement item:column)
	{
		System.out.println(item.getText());
	}
}
public void Search_ParticularColumnitem()
{
	Scanner item=new Scanner(System.in);
	System.out.println("The Element you want to search in the column is ");
	String search=item.nextLine();
	List<WebElement> columitem=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	for(WebElement column:columitem)
	{
		if(column.getText().equalsIgnoreCase(search))
		{
			System.out.println("The column item is present  "+search);
		}
	}
}
	
}
