package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Example extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert_Example obj=new Alert_Example();
		obj.initialiseBrowser();
		obj.alertoperations();

	}
	
	public void alertoperations()
	
	{
		WebElement alerts=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		alerts.click();
		WebElement jsalert=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		jsalert.click();
	}

}
