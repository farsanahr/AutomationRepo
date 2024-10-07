package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Messageshow_Automationex1 extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Messageshow_Automationex1 obj=new Messageshow_Automationex1();
		obj.initialiseBrowser();
		obj.showMessage();
	}
	
	public void showMessage()
	{
		//driver.navigate().to("");
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement txt=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		txt.sendKeys("Hello");
		WebElement enteredTxt=driver.findElement(By.xpath("//button[@id='button-one']"));
		enteredTxt.click();
		
	}

}
