package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_17 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().maximize();
        
        
        String parentwindow_add=driver.getWindowHandle();
        System.out.println(parentwindow_add);
        WebElement p=driver.findElement(By.xpath("//a[text()='Click Here']"));
        p.click();
        
        Set<String> all_add=driver.getWindowHandles();
       System.out.println(all_add);
       Iterator<String> Q=all_add.iterator();
       
       while(Q.hasNext()) {
    	   String Child_add=Q.next();
    	   if(!parentwindow_add.equals(Child_add)) {
    		   driver.switchTo().window(Child_add);
    		   driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");
    		   driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
    		   driver.close();
    	   }
       }
       
	}

}
