package seleniumTests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
	@Test
	public void Alert() throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("Text");
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File f=ss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\shapbnil\\Documents\\Screenshots\\abc.jpg"));
		driver.findElement(By.name("submit")).click();
		
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
}
}