package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CompoundInterestCalculator {
		
	  
	  public String baseUrl = "http://calculator.net/";
	  String driverPath = "c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe";
	  public WebDriver driver ; 
	  
	  
	   @Test(priority=0)
	 
	  public void launchBrowser() 
	   {
		      System.out.println("launching Chrome browser"); 
		      System.setProperty("webdriver.chrome.driver", driverPath);
		      driver = new ChromeDriver();
		      
			//WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Launch website
			driver.navigate().to("http://www.calculator.net/");
			// Maximize the browser
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("Financial Calculators")).click();
			driver.findElement(By.partialLinkText("Compound Interest Calculator")).click();
	  }



	   @Test(priority=1)
		public void CompoundInterestCalculator() throws InterruptedException
		{
		   		Thread.sleep(100);
		
				driver.findElement(By.name("cinterestrate")).clear();
				driver.findElement(By.name("cinterestrate")).sendKeys("7");
				
				Select drp= new Select(driver.findElement(By.name("cincompound")));
				drp.selectByVisibleText("Quarterly");
				
				
				driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr/td/table/tbody/tr[3]/td/input")).click();
	
					
				Select drp1= new Select(driver.findElement(By.name("coutcompound")));
				drp1.selectByVisibleText("Quarterly");
				Thread.sleep(100);

		}
				@Test(priority=2)	
				public void InflationCalculatorTest() 
				{ 
					driver.navigate().back();
				
				}
				
					@Test(priority=3)
					public void InflationCalculatorTest1() throws InterruptedException {
					
						Thread.sleep(10000);

						driver.findElement(By.id("cstartingamount1")).clear();
				        driver.findElement(By.id("cstartingamount1")).sendKeys("30");
				        
				        
				        Select drp= new Select(driver.findElement(By.name("cinyear1")));
				        drp.selectByVisibleText("2012");
				        
				        driver.findElement(By.xpath(" //*[@id=\'content\']/table[1]/tbody/tr/td/table/tbody/tr[2]/td/input[2]")).clear();
				        
						
						
						
						
						
						
						
						

		}
}
