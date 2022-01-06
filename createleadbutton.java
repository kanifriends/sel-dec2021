package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createleadbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kani");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("U");

WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dropdown = new Select(source);
dropdown.selectByVisibleText("Conference");
WebElement drop=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select dropdown1 = new Select(drop);
dropdown1.selectByValue("CATRQ_AUTOMOBILE");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kani");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("mozhi");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("shri");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/01/1990");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ece");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
WebElement drop1=driver.findElement(By.id("createLeadForm_currencyUomId"));
Select dropdown2 = new Select(drop1);
dropdown2.selectByVisibleText("AFA - Afghani");
WebElement drop2=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select dropdown3 = new Select(drop2);
int size= dropdown3.getOptions().size();
dropdown3.selectByIndex(size-4);
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("22");
driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("100");
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("5");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("004");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("12356789");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");

driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("kani");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("no11 bm plaza");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("jaya colony");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
WebElement drop3=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select dd4=new Select(drop3);
dd4.selectByVisibleText("Alabama");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6007");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("001");
WebElement drop4=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));

Select dd5=new Select(drop4);
dd5.selectByValue("AFG");
driver.findElement(By.name("submitButton")).click();
driver.close();


}
}