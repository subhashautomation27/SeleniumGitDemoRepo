package Selenium_programs;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) {
		//DemoFor Action class
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		
		/*
		 * WebElement ele=driver.findElement(By.xpath("//textarea[@id='ta1']")); //
		 * ele.sendKeys(Keys.CLEAR); ele.sendKeys(Keys.SHIFT); ele.sendKeys("subhash");
		 */		 
		  
		WebElement ele=driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
		System.out.println(ele.getText());
		
		Actions ac=new Actions(driver);
		
		//ac.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("subhashchandra Bose").doubleClick().build().perform();
		
		
;
	}

}
