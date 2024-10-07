package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators obj=new Locators();
		obj.initialiseBrowser();
		obj.LocateId();
		obj.LocateByClass();
		obj.LocateByName();

	}
public void LocateId()
{
	WebElement msg=driver.findElement(By.id("single-input-field"));
	WebElement valuea=driver.findElement(By.id("value-a"));
	WebElement valueb=driver.findElement(By.id("value-b"));
	WebElement date=driver.findElement(By.id("single-input-field"));
	WebElement checkbox=driver.findElement(By.id("gridCheck"));
}

public void LocateByClass()
{
WebElement data=driver.findElement(By.className("form-control"));
WebElement data2=driver.findElement(By.className("form-check-input"));
WebElement data3=driver.findElement(By.className("form-control datepicker"));
WebElement data4=driver.findElement(By.className("w25fleft"));
WebElement data5=driver.findElement(By.className(""));

}

public void LocateByName()
{
	WebElement name=driver.findElement(By.name("viewport"));
	WebElement desc=driver.findElement(By.name("description"));
	WebElement gender=driver.findElement(By.name("student-gender"));
	WebElement kywd=driver.findElement(By.name("keywords"));
	WebElement author=driver.findElement(By.name("author"));
	
}

public void LocateByLink()
{
	WebElement link1= driver.findElement(By.linkText("check-box-demo.php"));
	WebElement link2= driver.findElement(By.linkText("radio-button-demo.php"));
	WebElement link3= driver.findElement(By.linkText("form-submit.php"));
	WebElement link4= driver.findElement(By.linkText("select-input.php"));
	WebElement link5= driver.findElement(By.linkText("ajax-form-submit.php"));
}

public void LocateByPartiallink()
{
	WebElement partiallink1=driver.findElement(By.linkText("simple-form"));
	WebElement partiallink12=driver.findElement(By.linkText("select-input"));
	driver.findElement(By.linkText("check-box"));
	driver.findElement(By.linkText("radio-button"));
	driver.findElement(By.linkText("ajax-form"));
}
//css selector
public void tagAndId()
{
	WebElement tagid= driver.findElement(By.cssSelector("input#single-input-field"));
}
public void tagandclass()
{
	WebElement tagclass=driver.findElement(By.cssSelector("input.form-check-input"));
}
public void tagandattribute()
{
	WebElement tagattribute=driver.findElement(By.cssSelector("input[type=checkbox]"));
}
public void tagclassattribute()
{
	WebElement tagclassattribute=driver.findElement(By.cssSelector("input.fprm-check-input[type=checkbox]"));
}

}
