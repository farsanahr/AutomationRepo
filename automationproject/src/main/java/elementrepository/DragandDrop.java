package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragandDrop obj=new DragandDrop();
		obj.initialiseBrowser();
		obj.dragAndDropOpeerationn();
		
		

	}
public void dragAndDropOpeerationn()
{
	WebElement other=driver.findElement(By.xpath("//a[@id='others']"));
	other.click();
	WebElement dragitem=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	//dragitem.click();
	Actions actions=new Actions(driver);
	actions.moveToElement(dragitem).click();
	actions.doubleClick(dragitem).perform();
	WebElement droploc=driver.findElement(By.xpath("//div[@id='mydropzone']"));
	actions.dragAndDrop(dragitem, droploc).build().perform();
	
	
	}
}