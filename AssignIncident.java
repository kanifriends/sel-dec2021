package testcase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncident extends BaseClass1{
@Test	
	public void assignincident() {
		
	     driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
	     driver.switchTo().frame("gsft_main");
	     driver.findElement(By.xpath("//table[@id='incident_table']//tr[1]/td[3]/a")).click();
	     driver.switchTo().defaultContent();
	     driver.switchTo().frame("gsft_main");
	     WebElement num=driver.findElement(By.xpath("//input[@id='incident.number']"));
			String text=num.getAttribute("value");
			System.out.println(text);
			driver.switchTo().defaultContent();
	      driver.switchTo().frame("gsft_main");
	      driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']")).click();
	      driver.switchTo().defaultContent(); 
	      Set<String> windowHandles=driver.getWindowHandles();
			 List<String> windows=new ArrayList<String>(windowHandles);
			   driver.switchTo().window(windows.get(1));
            driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Software",Keys.ENTER);
            driver.findElement(By.xpath("//a[text()='Software']")).click();
            driver.switchTo().window(windows.get(0));
            driver.switchTo().frame("gsft_main");
          driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("Software group is assigned");
            driver.switchTo().defaultContent();
            driver.switchTo().frame("gsft_main");
            WebElement num1=driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']"));
			String text1=num1.getAttribute("value");
			System.out.println(text1);
			driver.switchTo().defaultContent();
			if(text1.contains("Software")) 
                 System.out.println("software is assinged");
			else 
				System.out.println("software is not assinged");
			}
}
