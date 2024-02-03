package Selenium_programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;

public class Assertions {

	public static void main(String[] args) {

      WebDriver driver=new ChromeDriver();
		/*
		 * SoftAssert sa=new SoftAssert(); sa.assertEquals("subhash", "subhash1");
		 * 
		 * sa.assertAll();
		 * 
		 * System.out.println("done");
		 */
		 Assert.assertEquals("abc", "abc1");
		 System.out.println("done1");
		 
		 File src=((TakeScreenShot)driver)
		 
		 

	}

}
