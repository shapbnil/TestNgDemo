package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesDemo {
	@Test
	public void frames() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.softwaretestinghelp.com/");
			driver.manage().window().maximize();
			
			WebElement frame=driver.findElement(By.id("aswift_0"));
			driver.switchTo().frame(frame);
			driver.findElement(By.linkText("Contact Us")).click();
			driver.switchTo().defaultContent();
	}
	
}
