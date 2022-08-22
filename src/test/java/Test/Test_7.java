package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_7 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		// Move towards element and click on it
		WebElement sel=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		act.moveToElement(sel).click().build().perform();
		act.click(sel).build().perform();
		Thread.sleep(5000);
		
		// Right click on element
		WebElement Rightclick_ele=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(Rightclick_ele).build().perform();
		act.click(Rightclick_ele).build().perform();
		Thread.sleep(5000);
		
		// Double click on element
		WebElement Double_ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Double_ele).build().perform();
		Thread.sleep(5000);
		
		driver.close();
	}
    
}
