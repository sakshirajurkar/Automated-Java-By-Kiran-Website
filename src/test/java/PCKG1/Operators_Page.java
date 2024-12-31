package PCKG1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Operators_Page {
	public static void main(String[] args) {
		WebDriver driver = LogIn_Main.LogInMain();
		WebElement op = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a/span"));
		op.click();
		System.out.println("Operators page opened>>>>>");
		String title = driver.getTitle();
		System.out.println("Title:-" + title);

		List <WebElement>content = driver.findElements(By.className("col-xs-12"));

		for(WebElement cont: content) {
			System.out.println(cont.getText());
		}
		String expResult = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/operators.html";
		String actResult = driver.getCurrentUrl();
		System.out.println("url>>"+driver.getCurrentUrl());
		
		if(expResult.equals(actResult)) {
			System.out.println("Url status>>>>Test case passed>>>>");
		}
		else {
			System.out.println("Url status>>>>Test case failed>>>>");
		}
		
		String expTitle = driver.getTitle();
		String actTitle = "JavaByKiran | user";
		
		if(expTitle.equals(actTitle)) {
			System.out.println("Title status Test case Passed");
		}
		else {
			System.out.println("Title status Test case failed");
		}
	}
}
