package PCKG1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class AddUser_Page {
public static void main(String[] args) {
	WebDriver driver = LogIn_Main.LogInMain() ;
	WebElement user = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a"));
	user.click();
	System.out.println("User page opened>>>");
	
	WebElement userPage = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
	
	userPage.click();
	System.out.println("Add user page opened>>");
	
	String title = driver.getTitle();
	System.out.println(title);
	
	System.out.println("Form fill up>>>");
	WebElement username = driver.findElement(By.className("form-control"));
	username.sendKeys("Sakshi");
	driver.findElement(By.id("mobile")).sendKeys("9737127391");
	driver.findElement(By.id("email")).sendKeys("sakshi@gmail.com");
	driver.findElement(By.id("course")).sendKeys("Testing");
	driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/input[2]")).click();
	WebElement state = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
	state.sendKeys("d");
	
	
	driver.findElement(By.id("password")).sendKeys("12345");
	driver.findElement(By.id("submit")).click();
	
	Alert alrt = driver.switchTo().alert();
	alrt.accept();
	System.out.println("Form successfully fillup....");
	
	
}
}
