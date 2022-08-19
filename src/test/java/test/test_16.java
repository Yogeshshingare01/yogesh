package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.reporters.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test_16 {

	public static void main(String[] args) throws Exception {
		//browser opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
	String path="C:\\Users\\Sagar\\eclipse-workspace\\batch_12_prpject\\testdata\\excel.xlsx";
	FileInputStream fsi=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fsi);
	 
	//identify first_nameelement
	WebElement first_name=driver.findElement(By.xpath("//input[@name='firstName']"));
	String A=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	first_name.sendKeys(A);
	Thread.sleep(2000);
	
	//identify last_name element
	WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
	String B=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	last_name.sendKeys(B);
	Thread.sleep(2000);
	
	//identify phone element
	WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
	String C=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	phone.sendKeys(C);
	Thread.sleep(2000);
	
	//identify email element
    WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
    String D=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
	email.sendKeys(D);
	Thread.sleep(2000);
	
	//identify address element
    WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
    String E=wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
    address.sendKeys(E);
	Thread.sleep(2000);
	
	//identify city element
    WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
    String F=wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
    city.sendKeys(F);
	Thread.sleep(2000);
	
	//identify state element
    WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
    String G=wb.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
    state.sendKeys(G);
	Thread.sleep(2000);
	
	//identify postal_code element
    WebElement postal_code=driver.findElement(By.xpath("//input[@name='postalCode']"));
    String H=wb.getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
    postal_code.sendKeys(H);
	Thread.sleep(2000);
	
	//identify country element
    WebElement drp=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel=new Select(drp);
	sel.selectByIndex(4);
	Thread.sleep(2000);
	
	//identify user_name element
    WebElement user_name=driver.findElement(By.xpath("//input[@name='email']"));
    String I=wb.getSheet("Sheet1").getRow(0).getCell(8).getStringCellValue();
    user_name.sendKeys(I);
	Thread.sleep(2000);
	
	//identify pass element
    WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
    String J=wb.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
    pass.sendKeys(J);
	Thread.sleep(2000);
	
	//identify confirm_pass element
    WebElement confirm_pass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
    String K=wb.getSheet("Sheet1").getRow(0).getCell(10).getStringCellValue();
    confirm_pass.sendKeys(K);
	Thread.sleep(2000);
	
	//identify submit_button element
    WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
    submit.click();
    
    //click on sign-in button
    //WebElement sign_in_button=driver.findElement(By.xpath("//a[text()='SIGN-OFF']"));
    //sign_in_button.click();
    
   driver.get("https://demo.guru99.com/test/newtours/login.php");
    
    WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
    String id=wb.getSheet("Sheet1").getRow(0).getCell(8).getStringCellValue();
    user.sendKeys(id);
    
    WebElement pass1=driver.findElement(By.xpath("//input[@name='password']"));
    String p=wb.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
    pass1.sendKeys(p);
    
    WebElement submit1=driver.findElement(By.xpath("//input[@name='submit']"));
    submit1.click();
	
    //select path
    String path_1="C:\\Users\\Sagar\\eclipse-workspace\\batch_12_prpject\\screenshot";
    
    //use random string mathod
    String rm=RandomString.make(3);
    
    //screenshot
    TakesScreenshot tss= (TakesScreenshot) driver;
    File tss1=tss.getScreenshotAs(OutputType.FILE);
    File dest=new File(path+"//"+rm+".png");
    FileUtils.copyFile(tss1, dest);
    Thread.sleep(2000);
		

	}

}
