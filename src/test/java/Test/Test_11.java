package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_11 {

   public static void main(String[] args) throws Exception {
	   
	   // Browser Open
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   
	   // Identify the WebElement
	   WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	   WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
       WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));

	   
	    String path="C:\\Users\\Asus\\Desktop\\Batch_12_Project\\TestData\\DataText.xlsx";
	    FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		
		// Fetch Data From EXCELSHEET
		String data_1=workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();  // 0,0 --> Test@gmail.com
		System.out.println(data_1);
		
        String data_2=workbook.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();  // 0,1 --> 12345678
		System.out.println(data_2);

       
		// Sending Test Data from Excel to WebElent
		   txt_email.sendKeys(data_1);
           txt_password.sendKeys(data_2);
           btn_login.click();
           
           Thread.sleep(5000);
       
       driver.close();
   		   		
        
           
           
           
	}

}
