package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_13 {

	public static void main(String[] args) throws Exception {
		//browser opening
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    
    //identify element
    WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
    WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
    
    //select the path
   String path="C:\\Users\\Sagar\\eclipse-workspace\\batch_12_prpject\\testdata\\data.xlsx";
   FileInputStream s=new FileInputStream(path);
   XSSFWorkbook wb=new XSSFWorkbook(s);
   
   String s_1=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
   System.out.println(s_1);
   txt_email.sendKeys(s_1);
   
   String s_2=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
   System.out.println(s_2);
    txt_password.sendKeys(s_2); 
   
   double s_3=wb.getSheet("sheet1").getRow(0).getCell(3).getNumericCellValue();
   System.out.println(s_3);
   
   String k=String.valueOf(s_3);
   String m=k.replace(".0", "");
   System.out.println(m);
   txt_password.sendKeys(m);
   

   
    
    
    
    
	}

}
