package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewDelete  extends Baseclass{
	@Test
	public void deletelead() throws InterruptedException {
		driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
     String str1="10031";
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(str1);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
