package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test_12 {
public static void main (String [] args) throws Exception {
	//open the browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	txt_email.sendKeys("test@gmail.com");
	Thread.sleep(2000);
	
	WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
	txt_pass.sendKeys("12345");
	Thread.sleep(2000);

	WebElement txt_btn=driver.findElement(By.xpath("//button[@name='login']"));
	txt_pass.click();
	Thread.sleep(2000);
	
	String path="C:\\Users\\Sagar\\eclipse-workspace\\batch_12_prpject\\screenshot";
	
	//use random string
	String rm=RandomString.make(4);
	
	//now take screenshot
	TakesScreenshot ts=(TakesScreenshot) driver;
	File srs=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(path+"//"+rm+".png");
	FileUtils.copyFile(srs, dest);
	driver.close();
	
	
			
			
	

	
	
	
	
	
	
}
}
