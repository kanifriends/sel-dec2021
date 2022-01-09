package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicatelead {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:/leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		 String str1="10034";
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(str1);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
			String dname=driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
			String dname1="Duplicate lead";
			boolean dname2=dname1.equals(dname);
			if(dname2==true) {
				System.out.println("Title is duplicate");
				
			}
			else {
				System.out.println("Title is not duplicate");
				
			}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	
String lname=driver.findElement(By.xpath("span[@id='viewLead_firstName_sp']")).getText();
String lname1="jagu";
boolean lname2=lname1.equals(lname);
if(lname2==true) {
	System.out.println("is leadname");
}
	else {
		System.out.println("is not leadname");
	}
}



	
	



}