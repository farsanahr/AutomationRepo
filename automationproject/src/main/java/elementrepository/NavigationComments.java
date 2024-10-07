package elementrepository;

public class NavigationComments extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigationComments obj=new NavigationComments();
		obj.initialiseBrowser();
		obj.navigateCommands();

	}
	
	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
