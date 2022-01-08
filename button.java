package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("home")).getAttribute("Go to Home Page"));
		System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("position")).getSize());
		// TODO Auto-generated method stub

	}

}
