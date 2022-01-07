package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("U");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("jagath@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("jagath@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("jagaath");
		WebElement source=driver.findElement(By.id("day"));
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("1");
		WebElement source1=driver.findElement(By.id("month"));
		Select dropdown1 = new Select(source1);
		dropdown1.selectByValue("4");
	// TODO Auto-generated method stub
		WebElement source2=driver.findElement(By.id("year"));
		Select dropdown2 = new Select(source2);
		dropdown2.selectByVisibleText("1990");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();
	}

}
