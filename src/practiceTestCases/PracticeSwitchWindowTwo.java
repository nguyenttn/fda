package practiceTestCases;


	import java.util.Set;
	 
	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.Alert;
	 
	import org.openqa.selenium.By;
	 
	import org.openqa.selenium.WebDriver;
	 
	import org.openqa.selenium.firefox.FirefoxDriver;
	 
	public class PracticeSwitchWindowTwo {
	 
			public static WebDriver driver;
	 
			public static void main(String[] args) {
	 
				// Create a new instance of the Firefox driver
 
	        driver = new FirefoxDriver();
 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	        // Launch the URL
 
	        driver.get("");
 
	        // Click on the Button "Alert Box"
 
	        driver.findElement(By.name("Alert Box")).click();
 
	        // Switch to JavaScript Alert window
 
	        Alert myAlert = driver.switchTo().alert();
 
	        // Accept the Alert
 
	        myAlert.accept();
 
	        // Close Original window
	 
		        driver.close();
	 
		}
	 
	
}
