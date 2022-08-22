package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_13 {

	public static void main(String[] args) throws Exception {

	// POPUP Handling By ALERT DISMISS SCRIPT
		
		// Browser Open	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		// Find Xpath of WebElement
		WebElement txt_cusid=driver.findElement(By.xpath("//input[@name='cusid']"));
		txt_cusid.sendKeys("1234567");
		
		WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_submit.click();
		
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);       // Do you really want to delete this Customer?

		alt.dismiss();
		
		Thread.sleep(3000);
		driver.close();
	}

}
