package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
WebElement java=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
java.click();
		
System.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input")).isSelected());
WebElement deselect=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
deselect.click();
driver.findElement(By.xpath("//div[text()='Option 1']/input[@type='checkbox']")).click();
driver.findElement(By.xpath("//div[text()='Option 2']/input[@type='checkbox']")).click();
driver.findElement(By.xpath("//div[text()='Option 3']/input[@type='checkbox']")).click();
driver.findElement(By.xpath("//div[text()='Option 4']/input[@type='checkbox']")).click();
driver.findElement(By.xpath("//div[text()='Option 5']/input[@type='checkbox']")).click();


}
}
