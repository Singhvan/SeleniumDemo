package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BMRTestCalc

{
		
		public String baseUrl = "http://calculator.net/";
	    String driverPath = "c:\\users\\vivek_2\\Desktop\\Vandana_Sel\\chromedriver_win32\\chromedriver.exe";
	    public WebDriver driver ; 
			 
	   // @BeforeTest
			@Test(priority=0)
		     //method 1
		      public void launchBrowser() {
	          System.out.println("launching Chrome browser"); 
	          System.setProperty("webdriver.chrome.driver", driverPath);
	          driver = new ChromeDriver();
	          driver.navigate().to(baseUrl);
	          //maximize
	          driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.findElement(By.partialLinkText("BMR Calculator")).click();
		}
					
				
					
					@Test(priority=1)
					public void BmrCalc() throws InterruptedException {
						driver.findElement(By.xpath("//*[@id=\"cage\"]")).clear();
				        driver.findElement(By.xpath("//*[@id=\"cage\"]")).sendKeys("35.5");
				     
						//click on radio button
						driver.findElement(By.id("csex2")).click();
						
						driver.findElement(By.id("cheightfeet")).clear();
				        driver.findElement(By.id("cheightfeet")).sendKeys("5.5");
				       

				        driver.findElement(By.id("cpound")).clear();
				        driver.findElement(By.id("cpound")).sendKeys("105.5");
				        

						driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/div[2]/table[4]/tbody/tr[2]/td/input")).click();
					
					Thread.sleep(2000);
					driver.navigate().refresh();
			}
					
						@Test(priority=2)	
						public void AutoLoanCalc() 
			{ 
							driver.navigate().back();
						
							//driver.get("https://www.calculator.net/auto-loan-calculator.html");
			}
						
						@Test(priority=3)
						public void AutoLoanCalc1() throws InterruptedException
			{
						Thread.sleep(1000);
					
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
					
					driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[1]/table/tbody/tr[10]/td/input[3]")).click();
					driver.close();
				  
				

						
} }	
						

						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					
