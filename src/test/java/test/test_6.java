package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_6 {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.firefoxdriver().setup();
   WebDriver driver=new FirefoxDriver();
   driver.get("https://demo.guru99.com/test/newtours/register.php");
   driver.manage().window().maximize();
   WebElement txt_searchbox=driver.findElement(By.xpath("//select[@name='country']"));
   Select sel=new Select(txt_searchbox);
   System.out.println(sel.getFirstSelectedOption().getText());
   Thread.sleep(2000);
   
   //selectByIndex
   sel.selectByIndex(3);
   Thread.sleep(2000);
   
   //select by value
   sel.selectByValue("ANGOLA");
   Thread.sleep(2000);
   
   //selectbytext
   sel.selectByVisibleText("BHUTAN");
   Thread.sleep(2000);
   
   List<WebElement> list=sel.getOptions();   
   System.out.println(list.size());
   
   for(int i=0;i<list.size();i++) {
	   String txt=list.get(i).getText();
	   System.out.println(txt);
	   if(txt.equals("ANGOLA")) {
		   sel.selectByVisibleText("ANGOLA");
		   break; 
		   
	   }
   }
   
	}

}
