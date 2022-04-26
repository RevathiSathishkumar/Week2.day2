package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFourCreateLead {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.className("inputBox")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathishkumar");
		driver.findElement(By.className("smallSubmit")).click();
		
		String str= driver.findElement(By.xpath("//div[text()='View Lead']/parent::div")).getText();
		
		System.out.println(str);
		
	}

}
