package elementrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table_Ex1 extends BaseClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table_Ex1 obj=new Table_Ex1();
		obj.initialiseBrowser();
		obj.table();
		System.out.println("@@@@@@@@@@@@@");
		obj.selectedRow();
		System.out.println("@@@@@@@@@@@@@");
		obj.rowValue();
		System.out.println("@@@@@@@@@@@@@");
		obj.columnValue();
		System.out.println("@@@@@@@@@@@@@");
		obj.findData();
		
	}
	
	public void table()
	{

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fulltable=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(fulltable.getText());
	}
	
	
	public void selectedRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fullrow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(fullrow.getText());
	}
	public void rowValue()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement srowvalue=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));
		System.out.println(srowvalue.getText());
	}
	
	public void columnValue()
	{

		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> fullcolumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement data:fullcolumn )
		System.out.println(data.getText());
	}
	
	public void findData()
	{
		String data="System Architect";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement >findelements=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement elements:findelements) {
			if(elements.getText().equals(data))
			{
				System.out.println(elements.getText());
			}
		}
	}
}
