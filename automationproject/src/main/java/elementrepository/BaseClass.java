package elementrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseClass obj=new BaseClass();
		obj.initialiseBrowser();
		//obj.closeQuit();
		

	}
	
	public void initialiseBrowser()
	{
		driver=new ChromeDriver();
		//driver=new EdgeDriver();
		//driver=new FirefoxDriver();
		
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
	}
	
	public void closeQuit()
	{
		driver.close();
		driver.quit();
	}

}
