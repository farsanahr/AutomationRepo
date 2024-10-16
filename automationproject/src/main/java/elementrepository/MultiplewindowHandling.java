package elementrepository;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiplewindowHandling  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allwindow=driver.getWindowHandles();
		String title="";
		for(String temp:allwindow) {
			if(!temp.equals(parentwindow)) {
				System.out.println("Allwindows"+ temp);
				driver.switchTo().window(temp);
				title=driver.getTitle();
				System.out.println("***********");
				//System.out.println(driver.getTitle());
			}
			if(title.equals("WebDriver | Login Portal"))
			{
				WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				username.sendKeys("farsana123");
				WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
				password.sendKeys("Login@123#");
				WebElement log=driver.findElement(By.xpath("//button[@id='login-button']"));
				log.click();
				
				
			}
			if(title.equals("WebDriver | Contact Us"))
			{
				WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
				firstname.sendKeys("farsana");
				WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastname.sendKeys("Hamdulla");
				WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
				email.sendKeys("hr@gmail.com");
				WebElement comments=driver.findElement(By.xpath("//textarea[@placeholder='Comments']"));
				comments.sendKeys("testcontact");
				WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
				submit.click();
				}
			//driver.switchTo().window(parentwindow);
			
		}

	}
	
	

}
