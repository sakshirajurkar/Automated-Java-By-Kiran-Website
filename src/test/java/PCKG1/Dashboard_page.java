package PCKG1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard_page {
	public static void main(String[] args) {
		WebDriver driver = LogIn_Main.LogInMain();
		System.out.println("Dahsboard page testing started....");

		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div/div[1]/section[2]"));

		System.out.println("Fetch elements of dashboard page>>");
		for (WebElement list : elements) {
			System.out.println(list.getText());
		}

//		WebElement link = driver.findElement(By.xpath("/html/body/div/footer/strong/a"));
//		link.click();
		System.out.println("Title of dashboard page>>>>");
		String title = driver.getTitle();
		System.out.println(title);
		
		String expTitle = "JavaByKiran | Dashboard";
		String ActTitle = driver.getTitle();
		 
		if(expTitle.equals(ActTitle)) {
			System.out.println("Dahsboard page title Test case passed");
		}
		else {
			System.out.println("Dahsboard page title Test case Failed");
		}
		
		String ExpResult = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html";
		String ActResult = driver.getCurrentUrl();
		
		if(ExpResult.equals(ActResult)) {
			System.out.println("Dahsboard page url Test case passed"); 
		}
		else {
			System.out.println("Dahsboard page url Test case failed");
		}

	}

}
