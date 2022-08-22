package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_12 {

	public static void main(String[] args) throws Exception {

	// POPUP Handling By ALERT ACCEPTING SCRIPT
		
		// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		// Find Xpath of WebElement
		WebElement txt_custid=driver.findElement(By.xpath("//input[@name='cusid']"));
		txt_custid.sendKeys("1234567");
		
		WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_submit.click();
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);      // Do you really want to delete this Customer?

		alt.accept();                  // Click on OK
		Thread.sleep(3000);
		
		String text_1=alt.getText();
		System.out.println(text_1);    // Customer Successfully Delete!

		
		alt.accept();                  // Click on OK
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
