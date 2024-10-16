package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Sample extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alert_Sample obj=new Alert_Sample();
		obj.initialiseBrowser();
		obj.bootstrapAlert();

	}
	
	public void bootstrapAlert()
	{
		WebElement alerts=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		alerts.click();
		WebElement btalert=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		btalert.click();
	}

}
