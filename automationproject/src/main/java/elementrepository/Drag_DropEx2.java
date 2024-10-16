package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropEx2 {
	
	ChromeDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drag_DropEx2 obj=new Drag_DropEx2();
		obj.launch();
		obj.dragdropsample();
	}
	
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		}
	
	
	public void dragdropsample()
	{
	WebElement dragitem=driver.findElement(By.xpath("//div[@id='draggable']"));
	//dragitem.click();
	Actions actions=new Actions(driver);
	 actions.moveToElement(dragitem).click();
	 WebElement dglocations=driver.findElement(By.xpath("//div[@id='droppable']"));
	 actions.dragAndDrop(dragitem, dglocations).build().perform();
		
		
	}

}
