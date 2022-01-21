package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		 alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert1=driver.switchTo().alert();
		String text1=alert.getText();
		System.out.println(text1);
		 alert1.dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert2=driver.switchTo().alert();
		String text2=alert.getText();
		System.out.println(text2);
		alert2.sendKeys("testleaf");
		alert2.accept();
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert alert3=driver.switchTo().alert();
		String text3=alert.getText();
		System.out.println(text3);
		alert3.accept();
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
