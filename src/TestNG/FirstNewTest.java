package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstNewTest {
	
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    
	    public WebDriver driver ; 
	  
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching Chrome browser"); 
	      
	      System.setProperty("webdriver.chrome.driver","c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Launch website
			
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tourss";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
}
}