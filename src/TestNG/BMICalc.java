package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BMICalc {
 
		  public String baseUrl = "http://calculator.net/";
		    String driverPath = "c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe";
		    public WebDriver driver ; 
		     
	     @Test(priority=3)
	     //method 1
	      public void launchBrowser() {
	          System.out.println("launching Chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.get(baseUrl);
	          //maximize
	          driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.findElement(By.partialLinkText("BMI Calculator")).click();
	     }
	     
	     //Method 2
				@Test(priority=2)
				public void Bmical() throws InterruptedException   {
					
					Thread.sleep(10000);
					//click on radio button
					driver.findElement(By.id("csex2")).click();

					System.out.println("The Output of the IsSelected " +driver.findElement(By.id("csex2")).isSelected());
					System.out.println("The Output of the IsEnabled " +driver.findElement(By.id("csex2")).isEnabled());
					System.out.println("The Output of the IsDisplayed " +driver.findElement(By.id("csex2")).isDisplayed());
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/table/tbody/tr/td/table[4]/tbody/tr/td/input[2]")).click();
					
		}
				
					//Method 3
					
					//we have to check this command
					
					
					@Test(priority=0)
					public void BmicalAge() throws InterruptedException 
		{
					driver.findElement(By.xpath("//*[@id=\"cage\"]")).clear();
					driver.findElement(By.xpath("//*[@id=\"cage\"]")).sendKeys("35");
					driver.findElement(By.name("csex")).click();

					driver.findElement(By.name("cheightfeet")).clear();
					driver.findElement(By.name("cheightfeet")).sendKeys("5");
					
					driver.findElement(By.name("cpound")).clear();
					driver.findElement(By.name("cpound")).sendKeys("120");
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\'content\']/div[3]/div[2]/table/tbody/tr/td/table[4]/tbody/tr/td/input[2]")).click();
									}			
  }

