package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// WebElement Identify--> Xpath By Attributes--> //tagname[@attribute name='value']
		
		// WebElement Identify  ---> Email
		WebElement txt_Email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_Email.sendKeys("Test@gmail.com");
		
		// WebElement Identify  ---> Password
		WebElement txt_Password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_Password.sendKeys("12345678");
		
		// WebElement Identify  ---> Login ---> Xpath by Contains
		WebElement btn_login=driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]"));
		btn_login.click();
		
		// Xpath by Text ---> //a[text()='Forgotten password?']
		
	    // Xpath by Index ---> (Xpath)[index]
		
	}	

}
