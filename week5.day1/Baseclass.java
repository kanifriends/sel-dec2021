package testcase;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Baseclass {
	public ChromeDriver driver;
  
 
  @BeforeMethod
  public void beforeMethod() {
  WebDriverManager.chromedriver().setup();

	 driver=new ChromeDriver();
	driver.get("http:/leaftaps.com/opentaps/");
	driver.manage().window().maximize();


	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("DemosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
}


  
  
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
