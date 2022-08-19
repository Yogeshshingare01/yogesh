package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_5 {


	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	WebElement txt=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	txt.sendKeys("apple");
	
	Thread.sleep(5000);
	
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().equals("apple watch series 7")) {
			list.get(i).click();
			break;
		}
	}
		
	
			}
				
			
			
		
	}
	


