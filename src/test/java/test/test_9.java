package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		//1)
		Actions act=new Actions(driver);
		WebElement drp_rsc=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		act.dragAndDrop(drp_rsc, dest).build().perform();
		Thread.sleep(2000);
		
		//2)
		WebElement drp_rsc1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dest1=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(drp_rsc1, dest1).build().perform();
		Thread.sleep(2000);
		
		//3)
		WebElement drp_rsc2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dest2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(drp_rsc2, dest2).build().perform();
		Thread.sleep(2000);
		
		//4)
		WebElement drp_rsc3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(drp_rsc3, dest3).build().perform();
		Thread.sleep(5000);

		
	}

}
