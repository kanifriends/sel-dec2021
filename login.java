package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

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
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("test teaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kani");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("u");
WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dropdown = new Select(source);
dropdown.selectByVisibleText("Conference");
driver.findElement(By.name("submitButton")).click();
driver.close();
	}

		


	}




