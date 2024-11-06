package testscript;

public class Browser_Commands extends Base {

	public static void main(String[] args) {
		Browser_Commands browser=new Browser_Commands();
		browser.InitialiseBrowser();
		browser.browserCommands();

	}
public void browserCommands()
{
	String title=driver.getTitle();
	System.out.println(title);
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	
}
}
