package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumXpath {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'SFA') ]")).click();
	    driver.findElement(By.xpath("//a[text()='Leads' ]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Create') ]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Revathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sathishkumar");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    String text=driver.findElement(By.xpath("//div[@id='ext-gen642']")).getText();
	    System.out.println(text);
	}

}
