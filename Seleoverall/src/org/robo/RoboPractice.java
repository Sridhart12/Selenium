package org.robo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RoboPractice {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sri_a\\eclipse-workspace\\Seleoverall\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys("Nisha");
		
		
		Actions acc=new Actions(driver);
		acc.doubleClick(username).perform();
		acc.contextClick(username).perform();
		
		Robot r =new Robot();
		for(int i = 0; i<=2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
		
		
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		
		}	
		
		
	}
	

}
