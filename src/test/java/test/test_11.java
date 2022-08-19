package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_11 {


	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//findelement on webpage by using xpath
	 WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	 email.sendKeys("test@gmail.com");
	 Thread.sleep(2000);
	 
	//findelement on webpage by using xpath of email
	 WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	 pass.sendKeys("12345");
	 Thread.sleep(2000);
	 
	//findelement on webpage by using xpath of pass
	 WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
	 Thread.sleep(2000);
	 btn_login.click();
	 
	 //select path of screenshot
	 String path="C:\\Users\\Sagar\\eclipse-workspace\\batch_12_prpject\\screenshot";
	 
	TakesScreenshot ts=(TakesScreenshot) driver;
	 File screenshot=ts.getScreenshotAs(OutputType.FILE);
	 File destn=new File(path+"test.png");
	 FileUtils.copyFile(screenshot, destn);
	 
	}

	
}
