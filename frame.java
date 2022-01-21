package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.switchTo().frame("iframeResult");
 driver.findElement(By.xpath("//button[text()='Try it']")).click();
 Alert alert=driver.switchTo().alert();
 alert.sendKeys("kani");
 alert.accept();
 
 String text=driver.findElement(By.id("demo")).getText();
 if(text.contains("kani")) {
	 System.out.println("name matching");
 } else {
		 System.out.println("not matching");
	 }
 }
 
 
		}