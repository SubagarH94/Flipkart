package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main (String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement txtUsername = driver.findElement(By.linkText("Enter Email/Mobile number"));
		txtUsername.sendKeys("9443907465");
		
		WebElement txtPswrd = driver.findElement(By.className("_2IX_2- VJZDxU"));
		txtPswrd.sendKeys("Subagar@0236");
		
		WebElement login = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
		login.click();
	}

}
