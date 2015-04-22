package practiceTestCases;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FindAllLinks {
 
	public static void main(String[] args) {
 
		WebDriver driver = new FirefoxDriver();
 
		driver.get("http://www.yahoo.com/");
		// find all links on a wbpage
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
 
		System.out.println("NUmber of links"+links.size());
		String sTitle = driver.getTitle();
		System.out.println(sTitle);
		
		// find all Checkboxes on a webpage
		java.util.List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']")); 
		System.out.println("Check Boxes"+checkboxes.size());
		
		// Number of menus on a Test Page
		java.util.List<WebElement> dropdown = driver.findElements(By.tagName("select"));  
		
		//Numberof text boxes on a web page
		java.util.List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']"));
		System.out.println("text boxes"+textboxes.size());

		 
		System.out.println(dropdown.size());
		
		}
	}
 

