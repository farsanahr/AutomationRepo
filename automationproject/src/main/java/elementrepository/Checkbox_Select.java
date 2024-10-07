package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Select {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox_Select obj=new Checkbox_Select ();
		obj.launchSite();
	}
	
	public void launchSite()
	{

	    driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		checkboxSelect();
	}
   public void checkboxSelect()
   {
	WebElement chbox=driver.findElement(By.id("checkboxes"));
	System.out.println(chbox.isSelected());
	chbox.click();
	WebElement chbox3=driver.findElement(By.xpath("//input[@value='option-3']"));
	System.out.println(chbox3.isSelected());
	WebElement chbox2=driver.findElement(By.xpath("//input[@value='option-2']"));
	System.out.println(chbox2.isSelected());
	WebElement chbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
	System.out.println(chbox1.isSelected());
	
}
}
