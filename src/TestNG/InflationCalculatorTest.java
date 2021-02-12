			package TestNG;
			import java.util.concurrent.TimeUnit;
			
			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
			
			public class InflationCalculatorTest
{

			public String baseUrl = "http://calculator.net/";
		    String driverPath = "c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe";
		    public WebDriver driver ;
		    
		    
			    @Test(priority=0)
			     //method 1
			      public void launchBrowser() 
			{
		          System.out.println("launching Chrome browser"); 
		          System.setProperty("webdriver.chrome.driver", driverPath);
		          driver = new ChromeDriver();
		          driver.get(baseUrl);
		          
		          //maximize
		          driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.findElement(By.partialLinkText("Inflation Calculator")).click();
				
			}		
				 @Test(priority=1)
				 
				 
					public void Bmical() throws InterruptedException  
		{
						
						Thread.sleep(10000);

						driver.findElement(By.id("cstartingamount1")).clear();
				        driver.findElement(By.id("cstartingamount1")).sendKeys("30");
				        
				        
				        Select drp= new Select(driver.findElement(By.name("cinyear1")));
				        drp.selectByVisibleText("2012");
				        
				        driver.findElement(By.xpath(" //*[@id=\'content\']/table[1]/tbody/tr/td/table/tbody/tr[2]/td/input[2]")).clear();
				        
				        
		}
			 
  }

