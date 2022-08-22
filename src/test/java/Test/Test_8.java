package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_8 {

	public static void main(String[] args) throws InterruptedException {

		// Drag and Drop Method
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement btn_src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dstn=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement btn_src1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dstn1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement btn_src2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement dstn2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement btn_src3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement dstn3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		act.dragAndDrop(btn_src, dstn).build().perform();
		act.dragAndDrop(btn_src1, dstn1).build().perform();
		act.dragAndDrop(btn_src2, dstn2).build().perform();
		act.dragAndDrop(btn_src3, dstn3).build().perform();

		Thread.sleep(5000);
	driver.close();
	}
    
}
