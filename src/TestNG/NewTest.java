package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeTest
	public void c_method(){
	System.out.println("I'm in method C");
	}
	@Test(priority=1)
	public void b_method(){
	System.out.println("I'm in method B");
	}
	@AfterTest
	public void a_method(){
	System.out.println("I'm in method A");
	}
	@Test(priority=2)
	public void e_method(){
	System.out.println("I'm in method E");
	}
	@Test(priority=0)
	public void d_method(){
	System.out.println("I'm in method D");
	}
}
