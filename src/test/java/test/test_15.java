package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_15 {
    //browser open
	public static void main(String[] args) throws Exception {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.guru99.com/test/newtours/register.php");
    driver.manage().window().maximize();
    
    //select path
    String path="C:\\Users\\Sagar\\eclipse-workspace\\batch_12_prpject\\testdata\\excel2.xlsx";
    FileInputStream s=new FileInputStream(path);
    XSSFWorkbook wb=new XSSFWorkbook(s);
    
    WebElement name=driver.findElement(By.xpath("//input[@name='firstName']"));
    String k=wb.getSheet("sheet2").getRow(0).getCell(0).getStringCellValue();
    name.sendKeys(k);
	}

}
