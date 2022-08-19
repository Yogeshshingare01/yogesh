package test_2_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 {
    @Test
    public void test_tc_001() throws Exception  {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	WebElement txt_login=driver.findElement(By.xpath("//input[@id='email']"));
    	txt_login.sendKeys("test@gmai");
    	Thread.sleep(2000);
    	
    	driver.close();
    	
    	
    	
    	
    }
}
