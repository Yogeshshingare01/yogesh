package test_2_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_scroll_handle {
	@Test
	public void Scroll_handle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//create the object of javascriptexecutor class
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll by pixel(top to bottom)
		js.executeScript("window.scrollBy(0,500)", "");
		
		Thread.sleep(5000);
		
		//scroll by pixel(bottom to top)
		js.executeScript("window.scrollBy(0,-500)", "");
		
		Thread.sleep(5000);
		
		//scroll by element(top to bottom)
		WebElement element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		
		
	}

}
