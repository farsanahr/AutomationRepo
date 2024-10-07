package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpathexample extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void absoluteXpath()
	{
		WebElement xpath1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement xpath2=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[1]/input"));
		WebElement xpath3=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/div[2]/input"));
		WebElement xpath4=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
		WebElement xpath5=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div[2]/form/div[1]/div[1]/input"));
	}
public void relativeXpath()
{
	WebElement relativexpath1=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	WebElement relativexpath2=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
	WebElement relativexpath3=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	WebElement relativexpath4=driver.findElement(By.xpath("//textarea[@id='description']"));
}
public void dynamicXpath()
{
	WebElement dynamicxpath1=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
	WebElement dynamicxpath2=driver.findElement(By.xpath("//input[contains(@id,'validationCustom01')]"));
	WebElement dynamicxpath3=driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary')]"));
}
public void textXpath()
{
	WebElement text=driver.findElement(By.xpath("//button[text()='Show Message']"));
	WebElement txt2=driver.findElement(By.xpath("//textarea[text()='description']"));
	WebElement txt3=driver.findElement(By.xpath(""));
}
public void axesChild()
{
	WebElement child=driver.findElement(By.xpath("//a[@class='navbar-brand']//child::img[@alt='logo']"));
}

public void axesParent()
{
	WebElement parent=driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
}
public void axesFollowtag()
{
	WebElement followtag=driver.findElement(By.xpath("//input[@type='text']//following::input"));
}
}
