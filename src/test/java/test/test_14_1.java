package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_14_1 {

	public static void main(String[] args) throws Exception {
		//browser opening
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://demo.guru99.com/test/delete_customer.php");
				driver.manage().window().maximize();
				
	 //identify element
				WebElement txt_s=driver.findElement(By.xpath("//input[@name='cusid']"));
				txt_s.sendKeys("12345");
				Thread.sleep(2000);
				
				//click on proceed button
			WebElement txt_p=driver.findElement(By.xpath("//input[@name='submit']"));
			txt_p.click();
			Thread.sleep(2000);
			
			Alert n=driver.switchTo().alert();
			String p=n.getText();
			n.dismiss();
		
			

	}

}
