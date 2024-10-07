package elementrepository;

public class BrowserCommands extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands obj=new BrowserCommands();
		obj.initialiseBrowser();
		obj.browserCommandsExecute();

	}
public void browserCommandsExecute()
{
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String pageSource=driver.getPageSource();
	System.out.println(pageSource);
}
}
