package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_2 {

	public static void main(String[] args) throws InterruptedException {
		//browser opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title); //facebook=login page
		String url=driver.getCurrentUrl(); //facebook url get
		System.out.println(url);
		driver.navigate().to("https://maven.apache.org/");
		Thread.sleep(5000); //5 sec
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.close();
		
	}

}
