package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selectall_Checkboxes extends  Checkbox_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Selectall_Checkboxes obj=new Selectall_Checkboxes();
		obj.launchSite();
		obj.showAll();
		

	}
	
	public void showAll()
	{
		//WebElement chbox3=driver.findElement(By.xpath("//input[@value='option-3']"));
		List<WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
		for(WebElement elmt:elements)
		{
			
			elmt.click();
			
		}
	}

}
