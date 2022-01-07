package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createcontact2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:/leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemosalesManager");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("kani");
		driver.findElement(By.id("lastNameField")).sendKeys("U");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("kani");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("mozhi");
		driver.findElement(By.name("departmentName")).sendKeys("ece");
		driver.findElement(By.id("createContactForm_description")).sendKeys("work statred");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kani@gmail.com");
		WebElement source=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("work finished");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
