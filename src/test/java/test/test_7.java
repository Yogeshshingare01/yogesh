package test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//mause work and click operation on salenium webelement
		WebElement drp_salenium=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		Actions act=new Actions(driver);
		act.moveToElement(drp_salenium).click(drp_salenium).build().perform();
		
		Thread.sleep(3000);
		//mouse work on gmail
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement drp_gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		act.moveToElement(drp_gmail).build().perform();
		
		Thread.sleep(3000);
		//mouse right click on right click button
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement drp_rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(drp_rightclick).build().perform();
		
		Thread.sleep(3000);
		//double click operation
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement Double_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Double_click).build().perform();
		
	}

}
