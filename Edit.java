package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	
		public static void main(String[] args) {
			
			//open a browser
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leafground.com/pages/Edit.html");
			driver.manage().window().maximize();
			
			//Enter your email address
			driver.findElement(By.id("email")).sendKeys("revathikalaivanim@gmail.com");
			
			
			//Append a text and press keyboard tab
			driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("TestLeaf");
			
			//Get default text entered
			System.out.println(driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("value"));
			
	        //Clear the text
	        driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
	        
	        //Confirm that edit field is disabled
			System.out.println(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled());
			
			
		}

	}



