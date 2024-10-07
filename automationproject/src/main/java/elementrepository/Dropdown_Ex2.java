package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Ex2 {
	
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dropdown_Ex2 obj=new Dropdown_Ex2();
		obj.launchSite();

	}
	
	public void launchSite()
	{

	    driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		dplist();
	}
	public void dplist()
	{
		//WebElement dpdn=driver.findElement(By.className("dropdown-menu-lists"));
		//dpdn.click();
		WebElement dplist1=driver.findElement(By.id("dropdowm-menu-1"));
		dplist1.click();
		Select select1=new Select(dplist1);
		select1.selectByValue("python");
		dplist1.click();
		WebElement dplist2=driver.findElement(By.id("dropdowm-menu-2"));
		Select select2=new Select(dplist2);
		select2.selectByIndex(3);
		dplist2.click();
		WebElement dplist3=driver.findElement(By.id("dropdowm-menu-3"));
		dplist3.click();
		Select select3=new Select(dplist3);
		select3.selectByVisibleText("CSS");
		dplist3.click();
		
	}

}
