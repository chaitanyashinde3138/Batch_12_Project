package Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShotCapture {

	public static void main(String[] args) throws Exception {

		// Take Screen Shot Using Random String Name
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test@gmail.com");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.sendKeys("12345678");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		btn_login.click();		
		Thread.sleep(5000);
		
		String path="C:\\Users\\Asus\\Desktop\\Batch_12_Project\\ScreenShot";
		
		String rm=RandomString.make(3);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+rm+".png");
		
		FileUtils.copyFile(src, destn);
		
		driver.close();
	}

}

		
		
		
		
		
		
		
		
		
		
		