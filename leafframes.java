package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafframes {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement firstframe =driver.findElement(By.xpath("//button[@id='Click']"));	
	     File source = firstframe.getScreenshotAs(OutputType.FILE);
		File  destination=new File("./snaps/click.png");
		FileUtils.copyFile(source,destination);
		driver.switchTo().defaultContent();
		List<WebElement>totalFrames= driver.findElements(By.tagName("iframe"));
		
		System.out.println(totalFrames.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
