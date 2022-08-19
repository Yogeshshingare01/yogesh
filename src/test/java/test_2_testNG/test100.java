package test_2_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test100 {
	WebDriver driver;
	@BeforeMethod
	public void B_open() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://web.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void B_close() {
		driver.close();
	}
	
	
	   
    

}
