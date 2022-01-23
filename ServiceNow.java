package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev108599.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Jagu@123456");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']/span")).click();
		driver.switchTo().defaultContent();
	    Set<String> windowHandles=driver.getWindowHandles();
		 List<String> windows=new ArrayList<String>(windowHandles);
		   driver.switchTo().window(windows.get(1));
		   //driver.switchTo().frame("gsft_main");
		  driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		  driver.switchTo().window(windows.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//a[@id='lookup.incident.short_description']")).click();
	driver.switchTo().defaultContent();
		Set<String> windowHandles1=driver.getWindowHandles();
		 List<String> windows1=new ArrayList<String>(windowHandles1);
		   driver.switchTo().window(windows1.get(1));
		   driver.findElement(By.linkText("Issue with a web page")).click();
		    driver.switchTo().window(windows1.get(0));
		   driver.switchTo().frame("gsft_main");
		WebElement num=driver.findElement(By.xpath("//input[@id='incident.number']"));
		String incidentnum=num.getAttribute("value");
		System.out.println(incidentnum);
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//span[text()='Press Enter from within the input to submit the search.']/following::input[1]")).sendKeys(incidentnum,Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		WebElement num1=driver.findElement(By.xpath("//input[@id='incident.number']"));
		String incidentnum1=num1.getAttribute("value");
		System.out.println(incidentnum1);
		driver.switchTo().defaultContent();
		if(incidentnum1.equals(incidentnum)) {
			System.out.println("incidentnum verified");
		
			
	 File source = driver.getScreenshotAs(OutputType.FILE);
		File  destination=new File("./snaps1/click.png");
		FileUtils.copyFile(source, destination);
	
		}
	else 
			System.out.println("incidentnum not verified");
		}
			
	
}

	


