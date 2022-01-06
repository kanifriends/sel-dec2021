package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createcontact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:/leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("kani");
		driver.findElement(By.id("lastNameField")).sendKeys("U");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("04/01/1990");
	WebElement source=driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select dropdown = new Select(source);
		dropdown.selectByValue("AFA");
		driver.findElement(By.name("submitButton")).click();
		
		
	}
}
		
		