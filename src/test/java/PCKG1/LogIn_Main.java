package PCKG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class  LogIn_Main {
	public static WebDriver LogInMain() {
			final String OfflineWeb = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
			WebDriver driver=new ChromeDriver();
		    driver.get(OfflineWeb);
             driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
		  	System.out.println("Url Opened");
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("kiran@gmail.com");
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("123456");
			WebElement signIn = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
			signIn.click();
			System.out.println("Dashboard page opened");
			
			return driver;
		}
	
}
