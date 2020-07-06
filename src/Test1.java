import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/kalaivani/Downloads/Karthik/Project/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		driver.get("https://login.salesforce.com/");
				
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("karthik.subramaniyan-bf3b@force.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Keyboard@98765");
		
//		driver.findElement(By.xpath("//input[@id='Login']")).click();
//		
//		Thread.sleep(800000);
//				
//		System.out.println(driver.switchTo().alert().getText());	
				
	}

}
