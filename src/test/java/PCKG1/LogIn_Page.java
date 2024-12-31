package PCKG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn_Page {
public static void main(String[] args) {
	WebDriver driver = LogIn_Main.LogInMain();


	public void CheckingTitle() {
		String ActTitle = driver.getTitle();
		String ExtTitle = "Dashboard";

		if (ActTitle.equals(ExtTitle)) {
			System.out.println("Test case of title passed");
		} else {
			System.out.println("Test case of title failed");
		}
	}

	public void CheckingUrl() {

		String ActUrl = driver.getCurrentUrl();
		String ExpUrl = "file:///C:/Users/GANESH/Desktop/Selenium/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html";

		if (ActUrl.equals(ExpUrl)) {
			System.out.println("Test case of URL passed");
		} else {
			System.out.println("Test case of URL failed");
		}
	}

	public void CheckingCaption() {

		WebElement Caption = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));

		String ActCaption = Caption.getText();
		String ExpCaption = "KiranAcademy";

		if (ActCaption.equals(ExpCaption)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
	}
}
}
