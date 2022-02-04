package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Updateincident extends BaseClass1{
@Test
	
	public void updateincident() {
		
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//table[@id='incident_table']//tr[1]/td[3]/a")).click();
		//driver.findElement(By.xpath("//div[@id='context_list_rowincident']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
	    String text=driver.findElement(By.xpath("//input[@id='incident.number']")).getText();
	    System.out.println(text);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		WebElement source=driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select dropdown=new Select(source);
		String text1 = source.getText();
		dropdown.selectByValue("1");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		WebElement source1=driver.findElement(By.id("incident.state"));
		Select dropdown1=new Select(source1);
		 dropdown1.selectByValue("2");
		String text2 =source1.getText();
	   System.out.println(text2);
	   // dropdown1.selectByValue("2");
	    driver.switchTo().defaultContent();
		
		if(text1.contains("High")&& text2.contains("In Progress"))
			System.out.println("verify");
		  driver.switchTo().frame("gsft_main");
           driver.findElement(By.xpath("(//button[text()='Update'])[2]")).click();
	        driver.switchTo().defaultContent();
		}
		
		
		
	}


