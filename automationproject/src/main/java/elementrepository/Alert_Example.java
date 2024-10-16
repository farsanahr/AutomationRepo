package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_Example extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert_Example obj=new Alert_Example();
		obj.initialiseBrowser();
		//obj.alertoperations();
		//obj.alertoperations2();
		obj.alertoperations3();

	}
	
	public void alertoperations()
	
	{
		WebElement alerts=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		alerts.click();
		WebElement jsalert=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		jsalert.click();
		WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		button.click();
		driver.switchTo().alert().accept();
		
	}
	public void  alertoperations2()
	{
		WebElement alerts=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
		alerts.click();
		WebElement jsalert=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
		jsalert.click();
		WebElement button2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		button2.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		}
public void alertoperations3()
{

	WebElement alerts=driver.findElement(By.xpath("//a[@href='bootstrap-alert.php']"));
	alerts.click();
	WebElement jsalert=driver.findElement(By.xpath("//a[@href='javascript-alert.php']"));
	jsalert.click();
	WebElement button3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	button3.click();
	driver.switchTo().alert().sendKeys("test alert");
	driver.switchTo().alert().accept();
}
}
