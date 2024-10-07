package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown_automationex3 extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dropdown_automationex3 obj=new dropdown_automationex3();
		obj.initialiseBrowser();
		obj.dropdownList();

	}
	
	public void dropdownList()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement selectinput=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		selectinput.click();
		WebElement dplist=driver.findElement(By.id("single-input-field"));
		Select select=new Select(dplist);
		//select.selectByVisibleText("Yellow");
		//select.selectByIndex(1);
		select.selectByValue("Green");
		
	}

}
