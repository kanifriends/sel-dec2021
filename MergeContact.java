package week4.day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:/leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemosalesManager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		 
		 List<String> windows=new ArrayList<String>(windowHandles);
		   driver.switchTo().window(windows.get(1));
         driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			
			driver.switchTo().window(windows.get(0));
	
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1=driver.getWindowHandles();
		List<String> windows1=new ArrayList<String>(windowHandles1);
		   driver.switchTo().window(windows1.get(1));
		   driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
			   driver.switchTo().window(windows1.get(0));
			 driver.findElement(By.xpath("//a[text()='Merge']")).click();
         Alert alert=driver.switchTo().alert();
         alert.accept();
         String Title=driver.getTitle();
         System.out.println(Title);
        

}}