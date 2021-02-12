package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Guru99login {
	
	 public String baseUrl = "http://www.demo.guru99.com/V4/";
	  String driverPath = "c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\geckodriver.exe";
	  public WebDriver driver ; 
	  
	
	 @Test(priority=0)
	 
			 		public void launchBrowser() {
			      System.out.println("launching Chrome browser"); 
			      System.setProperty("webdriver.gecko.driver", driverPath);
			      driver = new FirefoxDriver();
			      
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			// Launch website
			driver.navigate().to("http://www.demo.guru99.com/V4/");
			driver.manage().window().maximize(); 
	 }
			
			
			 @Test(priority=1)
				public void AutoLoanCalc() {
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("emailid");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("passid");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();

}}
