package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class isenabled extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 isenabled obj=new  isenabled();
		 obj.initialiseBrowser();
		 obj.enabled();

	}

	public void enabled()
	{
		WebElement inputform=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputform.click();
		WebElement txt=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		System.out.println(txt.isEnabled());
	}
}
