package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailunique {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://erail.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement from=driver.findElement(By.id("txtStationFrom"));
			from.clear();
			from.sendKeys("MS");
			Thread.sleep(500);
			from.sendKeys(Keys.TAB);
		WebElement to=driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU");
		Thread.sleep(500);
		to.sendKeys(Keys.TAB);
			driver.findElement(By.id("chkSelectDateOnly")).click();
	int rowsize=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
	List<String>trainNames=new ArrayList<String>();
	    for(int i=1 ;i<=rowsize; i++)	{
	String trainName=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+ i +"]/td[2]")).getText();
	    trainNames.add(trainName);
	    System.out.println(trainNames.size());
	    
	    Set<String>trains=new HashSet<String>(trainNames);
	     int  size=trainNames.size();
	     System.out.println("Number of trains:"+size);
	     System.out.println("Number of train list:"+trainNames);
	    }
}}
