package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class addition_automationex2 extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition_automationex2 obj=new addition_automationex2();
		obj.initialiseBrowser();
		obj.addition();
		

	}
	
	public void addition()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement valuea=driver.findElement(By.xpath("//input[@id='value-a']"));
		valuea.sendKeys("20");
		WebElement valueb=driver.findElement(By.xpath("//input[@id='value-b']"));
		valueb.sendKeys("50");
		WebElement result=driver.findElement(By.xpath("//button[@id='button-two']"));
		result.click();
		
	}

}
