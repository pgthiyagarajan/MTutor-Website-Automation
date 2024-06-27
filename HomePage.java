package website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	public static void main(String[] args) throws InterruptedException{
		//This code covers the home page of the mobile tutor website		
		ChromeDriver driver =  new ChromeDriver();
		
		//Fetching the URL
		driver.get("https://www.m-tutor.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//About us
		Thread.sleep(5000);
		driver.findElement(By.linkText("About us")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		//Why MTutor ?
		Thread.sleep(5000);
		driver.findElement(By.linkText("Why MTutor ?")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.navigate().back();
		

		//Careers
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='nav_mini_three']/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		//Thoughts
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='nav_mini_five']/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		//Contact us
		Thread.sleep(5000);
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("body")).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		driver.navigate().back();
		
		//login
		driver.findElement(By.xpath("//span[contains(@class,'mmr-txt-all text-blue')]")).click();
		driver.findElement(By.id("email")).sendKeys("SSIET@mailinaitor.com");
		driver.findElement(By.id("password")).sendKeys("Demo123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbtn")).click();

		
		//To close the browser
		Thread.sleep(5000);
		driver.close();
	}

}
