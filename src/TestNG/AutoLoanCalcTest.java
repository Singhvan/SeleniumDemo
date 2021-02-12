package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class AutoLoanCalcTest {
	
  
  public String baseUrl = "http://calculator.net/";
  String driverPath = "c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\geckodriver.exe";
  public WebDriver driver ; 
  
  
   @Test(priority=0)
 
  public void launchBrowser() {
      System.out.println("launching Chrome browser"); 
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      
	//WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Launch website
	driver.navigate().to("http://www.calculator.net/");
	// Maximize the browser
	driver.manage().window().maximize();
	driver.findElement(By.partialLinkText("Financial Calculators")).click();
	driver.findElement(By.partialLinkText("Auto Loan Calculator")).click();
  }
	 @Test(priority=1)
		public void AutoLoanCalc() throws InterruptedException {
	
	driver.findElement(By.name("cloanamount")).clear();
	driver.findElement(By.name("cloanamount")).sendKeys("20000");
		
	driver.findElement(By.name("cloanterm")).clear();
	driver.findElement(By.name("cloanterm")).sendKeys("5.2");
		
	driver.findElement(By.name("cinterestrate")).clear();
	driver.findElement(By.name("cinterestrate")).sendKeys("4.7");

	driver.findElement(By.name("cdownpayment")).clear();
	driver.findElement(By.name("cdownpayment")).sendKeys("5100");
		 
	driver.findElement(By.name("ctradeinvalue")).clear();
	driver.findElement(By.name("ctradeinvalue")).sendKeys("5");
	
	Select drp= new Select(driver.findElement(By.name("cstate")));
	drp.selectByVisibleText("Iowa");
	
	
	driver.findElement(By.name("csaletax")).clear();
	driver.findElement(By.name("csaletax")).sendKeys("4");
		
	driver.findElement(By.name("ctitlereg")).clear();
	driver.findElement(By.name("ctitlereg")).sendKeys("12");
	Thread.sleep(1000);
	

	//Click Calculate Button
	
	driver.findElement(By.xpath("//*[@id=\"calinputtable\"]/tbody/tr[10]/td/input[3]")).click();
	driver.close();
  }
}
