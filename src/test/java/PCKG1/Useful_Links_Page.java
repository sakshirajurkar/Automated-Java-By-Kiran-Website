package PCKG1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Useful_Links_Page {
public static void main(String[] args) {
	WebDriver driver = LogIn_Main.LogInMain();
	driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span")).click();
	System.out.println("Useful link page opened....");
	WebElement head = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
	System.out.println(head.getText());
	
	List <WebElement> elements = driver.findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div/div"));
	for(WebElement ele :elements ) {
		System.out.println(ele.getText());
	}
	
	WebElement link1 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/a"));
	link1.click();
	System.out.println("Link1 open");
	String act_url_Page1 = driver.getCurrentUrl();
	String exp_Url_Page1 = "https://javabykiran.com/news";
	if(act_url_Page1.equals(exp_Url_Page1)) {
		System.out.println("Test case of link1 passed");
	}
	else {
		System.out.println("Test case of link1 failed");
	}
	String act_Title = driver.getTitle();
	System.out.println(act_Title);
	
	WebElement link2= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[3]/a"));
	link2.click();
    System.out.println("Link2 open");
    String act_Title_Link2 = driver.getTitle();
    System.out.println(act_Title_Link2);
    
    WebElement link3 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[3]/a"));
    link3.click();
    System.out.println("Link3 open");
    String act_Title_link3 = driver.getTitle();
    System.out.println(act_Title_link3);
    
    WebElement link4 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[3]/a"));
    link4.click();
    System.out.println("Link4 open");

    
    WebElement link5 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[6]/td[3]/a"));
    link5.click();
    System.out.println("Link5 open");

        
    WebElement link6 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[7]/td[3]/a"));
    link6.click();
    System.out.println("Link6 open");

}
}
