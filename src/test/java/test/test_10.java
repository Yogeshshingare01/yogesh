package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txt_gmail=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
        Actions act=new Actions(driver);
        act.keyDown(txt_gmail, Keys.SHIFT).sendKeys("test").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(2000);
        
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
        
        WebElement txt_pass=driver.findElement(By.xpath("//input[@id='pass']"));
        txt_pass.click();
        Thread.sleep(2000);
        
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        WebElement btn_login=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
        btn_login.sendKeys(Keys.ENTER);
	}

}