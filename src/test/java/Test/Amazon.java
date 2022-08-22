package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txt_SearchBar=driver.findElement(By.xpath("//input[@type='text']"));
		txt_SearchBar.sendKeys("Oneplus Mobiles");
		
		Thread.sleep(3000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@aria-label='oneplus mobiles 5g']"));
		System.out.println(list.size());

		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("Oneplus Mobiles 5g"));
			    list.get(i).click();
                break;	
		}
		
		Thread.sleep(5000);
    driver.close();
	}
   
}
