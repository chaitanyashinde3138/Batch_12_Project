package Test_2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserHandle {

	public static void main(String[] args) {
		// Browser Open
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentwindowAdd=driver.getWindowHandle();
		System.out.println(parentwindowAdd);
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> AllAddress=driver.getWindowHandles();
		System.out.println(AllAddress);
		
		Iterator<String> it=AllAddress.iterator();
		
		while(it.hasNext()) {
			
			String childwindowAdd=it.next();
			
			if(parentwindowAdd.equals(childwindowAdd)) {
				
				driver.switchTo().window(childwindowAdd);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("123456789");
				driver.close();
				
			}
			
		}
		
		
		
		
	}

}
