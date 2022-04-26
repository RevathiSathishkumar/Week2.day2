package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	
	public static void main(String[] args) {
		
		//open a browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//go to home page
		//driver.findElement(By.linkText("Go to Home Page")).click();
		
		//Find where am supposed to go without clicking me?	
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		
		System.out.println(attribute);
		//driver.navigate().to(attribute);
		
		
		
		
	}

}
