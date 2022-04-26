package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
public static void main(String[] args) {
		
		//open a browser
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leafground.com/pages/Button.html");
	    driver.manage().window().maximize();
	    
		//Bond with buttons
	    
	    //Click button to travel home page
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		
		//Find position of button (x,y)
		System.out.println(driver.findElement(By.id("position")).getLocation());
		
		//Find button color
		System.out.println(driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("color"));
		
		//Find the height and width
		System.out.println(driver.findElement(By.id("size")).getSize());
		

	}
}
