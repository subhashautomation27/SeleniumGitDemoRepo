package Selenium_programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//
		driver.get("https://money.rediff.com/indices/bse/bse200?src=moneyhome_bseIndices");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(null));
		
		
		JavascriptExecutor jsp=(JavascriptExecutor)driver;
		//jsp.executeScript("arguments[0].scrollIntoView(true);",value);
		jsp.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(10000);
		
		  WebElement  value=driver.findElement(By.xpath("//a[text()='S&P BSE MidCap']//self::a"));
		  System.out.println(value.getText());//9584.77 
		  Actions ac=new Actions(driver);		  
		  WebElement value1=driver.findElement(By.xpath("//a[text()='S&P BSE 500']//parent::li"));
		  value1.sendKeys(Keys.chord(Keys.ENTER,"Z"));
		  System.out.println(value1.getText());
		 
		 // --//a[text()='S&P BSE 500']/ancestor::ul/child::li
		 List<WebElement> following_ele=driver.findElements(By.xpath("//a[contains(text(),'ACC Ltd.')]/ancestor::tr/following::tr"));
		
		 System.out.println("following elements"+following_ele.size());//79
		 
		 List<WebElement> following_sibling_ele=driver.findElements(By.xpath("//a[contains(text(),'ACC Ltd.')]/ancestor::tr/following-sibling::tr"));
			
		 System.out.println("following_sibling elements"+following_sibling_ele.size());//77
		 
		 
		 List<WebElement> preceding_ele=driver.findElements(By.xpath("//a[contains(text(),'Axis Bank Ltd.')]/ancestor::tr/preceding::tr"));
			
		 System.out.println("preceding_ele elements"+preceding_ele.size());//23
		 
		 List<WebElement> preceding_sibling_ele=driver.findElements(By.xpath("//a[contains(text(),'Axis Bank Ltd.')]/ancestor::tr/preceding-sibling::tr"));
			
		 System.out.println("preceding_sibling elements"+preceding_sibling_ele.size());//22
		 
			/*
			 * Iterator<WebElement> itr=cele.iterator(); while(itr.hasNext()) { WebElement
			 * ee =itr.next(); System.out.println(ee.getText()); }
			 */
		////a[text()='S&P BSE 500']//parent::li
		/*
		 * JavascriptExecutor jsp=(JavascriptExecutor)driver;
		 * jsp.executeScript("windows.scrollBy, args)
		 */
	}
	
	

}
