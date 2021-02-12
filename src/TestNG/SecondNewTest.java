package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondNewTest {
 
	  public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
	     
	     @Test(priority=0)
	     //method
	      public void launchBrowser() {
	          System.out.println("launching Chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      @Test(priority=1)
	      //method
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      @Test(priority=2)
	      public void terminateBrowser(){
	          driver.close();
	      }
	
  
}
