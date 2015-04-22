package practiceTestCases;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class PracticeWebElementCommands {
 
	public static WebDriver driver;
 
	public static void main(String[] args) {
 
		 // Create a new instance of the Firefox driver
 
        driver = new FirefoxDriver();
 
        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 
        driver.get("https://accounts.google.com/signup");
 
        // Type Name      
 
        driver.findElement(By.name("FirstName")).sendKeys("Tech"); 
 
        //Type Last Name
 
        driver.findElement(By.name("LastName")).sendKeys("Ligent");
 
        // Click on Submit
 
        driver.findElement(By.id("submitbutton")).click();
 
		}
 
	}