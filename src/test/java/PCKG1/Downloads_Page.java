package PCKG1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Downloads_Page {
public static void main(String[] args) {
	WebDriver driver = LogIn_Main.LogInMain();
	
	WebElement download = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span"));
	download.click();
	
	WebElement cont = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div"));
	System.out.println(cont.getText());
	
	WebElement btn_link1 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]"));
	btn_link1.click();
	String act_title1 = driver.getTitle();
	System.out.println(act_title1);
	String exp_title1 = "JavaByKiran | Downloads";
    if(act_title1.equals(exp_title1))	{
    	System.out.println("Test case of Java Development Kit title passed");
    }
    else {
    	System.out.println("Test case of Java Development Kit title failed");
    }
	String act_url1 = driver.getCurrentUrl();
	String exp_url1 = "https://www.oracle.com/java/technologies/downloads/#java8";
	if(act_url1.equals(exp_url1)) {
		System.out.println("Test case of Java Development Kit url passed");
	}
	else {
    	System.out.println("Test case of Java Development Kit url failed");

	}
	
	WebElement btn_link2 = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]"));
	btn_link2.click();
	String act_title2 = driver.getTitle();
	System.out.println(act_title2);
	String exp_title2 = "JavaByKiran | Downloads";
    if(act_title2.equals(exp_title2))	{
    	System.out.println("Test case of Selenium Server Standalon Jar title passed");
    }
    else {
    	System.out.println("Test case of Selenium Server Standalon Jar title failed");
    }
}
}
