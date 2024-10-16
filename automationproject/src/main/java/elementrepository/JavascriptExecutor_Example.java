package elementrepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor jsexec=(JavascriptExecutor) driver;
		jsexec.executeScript("window.scrollBy(0,1000)");
		jsexec.executeScript("window.scrollBy(0,-500)");
	}

}
