package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open a browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
	    driver.manage().window().maximize();
	    
	    
	    String attribute2 = driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).getAttribute("naturalWidth");
	    System.out.println(attribute2);
	    //Click on this image to go home page
	    
	   //driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
	    
	    
	    //Am I Broken Image?
	    Thread.sleep(5000);
	    
	    WebElement brokenImage = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
	    
	    String attribute = brokenImage.getAttribute("naturalWidth");
	    
	    if(attribute != null)
	    {
	    	System.out.println("This is the broken image");
	    }
	    else
	    {
	    	System.out.println("This is not a broken image");
	    }
	    }
	    
	    
	   // driver.close();		    
	}

