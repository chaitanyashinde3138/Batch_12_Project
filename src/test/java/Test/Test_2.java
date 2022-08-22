package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) throws InterruptedException {

		// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");  // URL
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);           // Facebook - log in or sign up

		String url=driver.getCurrentUrl();
		System.out.println(url);             // https://www.facebook.com/
		
		
		driver.navigate().to("https://mvnrepository.com/");
		Thread.sleep(5000);   // 5 seconds
		driver.navigate().back();
		Thread.sleep(5000);   // 5 seconds
		driver.navigate().forward();
		Thread.sleep(5000);   // 5 seconds
		driver.close();

		
	}

}
