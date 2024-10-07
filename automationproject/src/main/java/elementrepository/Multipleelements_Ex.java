package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Multipleelements_Ex extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleelements_Ex obj=new Multipleelements_Ex();
		obj.initialiseBrowser();
		obj.showElements();
		

	}

	public void showElements()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		List<WebElement> elements=driver.findElements(By.xpath("//input[@type='text']"));
		for(WebElement elmt:elements)
		{
			elmt.sendKeys("Hello");
		}
	}
}
