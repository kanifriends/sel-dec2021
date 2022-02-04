package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncident extends BaseClass1 {
@Test	
	public void deleteincident()  {

		
		driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
	     driver.switchTo().frame("gsft_main");
	     driver.findElement(By.xpath("//table[@id='incident_table']//tr[1]/td[3]/a")).click();
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("gsft_main");
	     driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
	      driver.switchTo().defaultContent();
	      driver.switchTo().frame("gsft_main");
	      String text=driver.findElement(By.xpath("(//div[@id='delete_confirm_form']//div)[4]/div")).getText();
		    System.out.println(text);
           driver.findElement(By.xpath("//button[@id='ok_button']")).click();
           driver.switchTo().defaultContent();
           if(text.contains("Delete"))
        	     System.out.println("The incident is delete");
        				else 
        					System.out.println("The incident is not delete");
        				}
           
           
}
