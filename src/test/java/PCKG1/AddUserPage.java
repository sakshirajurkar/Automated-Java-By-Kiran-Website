package PCKG1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddUserPage {
	public static void main(String[] args) {
		WebDriver driver = LogIn_Main.LogInMain();
		WebElement user = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a"));
		user.click();
		System.out.println("user page opened...");
		WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[1]/h1"));
		System.out.println(ele.getText());
		String title = driver.getTitle();
		System.out.println(title);

		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div"));

		for(WebElement ele1 : elements) {
			System.out.println(ele1.getText());
		}
		
	}
}
