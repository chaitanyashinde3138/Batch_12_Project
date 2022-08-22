package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_14 {

	public static void main(String[] args) throws Exception {

		// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// Identify the WebElement
		WebElement txt_firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement txt_lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement txt_phone=driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement txt_address=driver.findElement(By.xpath("//input[@name='address1']"));
		WebElement txt_city=driver.findElement(By.xpath("//input[@name='city']"));
		WebElement txt_state=driver.findElement(By.xpath("//input[@name='state']"));
		WebElement txt_postcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
        WebElement txt_username=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement txt_password=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement txt_confpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		
		
		// Coding for fetch the data from ExcelSheet
		String path="C:\\Users\\Asus\\Desktop\\Batch_12_Project\\TestData\\Data_1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		// Fetch Data from ExcelSheet
		String data_1=workbook.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data_1);
		
		String data_2=workbook.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data_2);
		
		String data_3=workbook.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(data_3);

		String data_4=workbook.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		System.out.println(data_4);

		String data_5=workbook.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
		System.out.println(data_5);

		String data_6=workbook.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
		System.out.println(data_6);

		String data_7=workbook.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
		System.out.println(data_7);

		String data_8=workbook.getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
		System.out.println(data_8);

		String data_9=workbook.getSheet("Sheet1").getRow(0).getCell(8).getStringCellValue();
		System.out.println(data_9);

		String data_10=workbook.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
		System.out.println(data_10);

		String data_11=workbook.getSheet("Sheet1").getRow(0).getCell(10).getStringCellValue();
		System.out.println(data_11);

		
		
		
		
		
		// Sending Test Data from ExcelSheet to WebElement

		txt_firstname.sendKeys(data_1);
		txt_lastname.sendKeys(data_2);
		//String data_3_S=String.valueOf(data_3);
		//String data=data_3_S.replace("1.23456789E9", "1234567890");
		//System.out.println(data);
		
		txt_phone.sendKeys(data_3);
		txt_email.sendKeys(data_4);
	    txt_address.sendKeys(data_5);
        txt_city.sendKeys(data_6);	
	    txt_state.sendKeys(data_7);
        txt_postcode.sendKeys(data_8);	
        Select sel=new Select(drp_country);
        sel.selectByValue("INDIA");	
        txt_username.sendKeys(data_9);	
	    txt_password.sendKeys(data_10);
        txt_confpass.sendKeys(data_10);
	    btn_submit.click();
	}

}
