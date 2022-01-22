package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String firstwindow=driver.getWindowHandle();
	     driver.findElement(By.xpath("//button[@id='home']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		  List<String> windows=new ArrayList<String>(windowHandles);
		   driver.switchTo().window(windows.get(1));
                String title=driver.getTitle();
                System.out.println(title);
			driver.close();
			driver.switchTo().window(windows.get(0));
			 driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windowHandles1=driver.getWindowHandles();
		List<String> windows1=new ArrayList<String>(windowHandles1);
		   driver.switchTo().window(windows1.get(1));
		   driver.switchTo().window(windows1.get(2));
		  driver.close();
				   driver.switchTo().window(windows1.get(0));
			driver.findElement(By.xpath("//button[text()='Do not close me ']")) .click();
			Set<String> windowHandles2=driver.getWindowHandles();
			List<String> windows2=new ArrayList<String>(windowHandles2);
			   driver.switchTo().window(windows2.get(1));
			   driver.switchTo().window(windows2.get(2));
			   driver.close();
			   driver.switchTo().window(windows2.get(0));
				
				driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
				Thread.sleep(3000);
				Set<String> windowHandles3=driver.getWindowHandles();
				List<String> windows3=new ArrayList<String>(windowHandles3);
				   driver.switchTo().window(windows3.get(1));
                    driver.switchTo().window(windows3.get(2));
                     driver.switchTo().window(windows3.get(0));
		           driver.quit();
		
	}

}
