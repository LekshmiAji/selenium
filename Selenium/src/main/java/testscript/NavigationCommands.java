package testscript;

public class NavigationCommands extends Base{

	public static void main(String[] args) {
		NavigationCommands navigate=new NavigationCommands();
		navigate.InitialiseBrowser();
		navigate.NavigateCommands();
		

	}
	public void NavigateCommands()
	{
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
