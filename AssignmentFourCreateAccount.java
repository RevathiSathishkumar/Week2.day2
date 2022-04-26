package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFourCreateAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("RevathiSatjishkumar");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Vipin");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Krish");
		driver.findElement(By.xpath("//td[@class='titleCell']/following::input[@id='annualRevenue']")).sendKeys("343534543534545");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		driver.close();	
		
	}
}
