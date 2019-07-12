package My_Project;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_test1 {

	
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("Before Class1");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Before test1");
	}
	
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Before Method1");
	}
	
	@BeforeGroups
	public void beforeGroup(){
		System.out.println("Before Group2");
	}
	@Test (groups="Regression")
	public void Test4(){
		System.out.println("Test4");
	}
	
	
	@Test
	public void Test5(){
		System.out.println("Test5");
	}
	
	@Test(groups="Sanity")
	public void Test6(){
		System.out.println("Test6");
	}
	
	@Test (groups="Regression")
	public void Test7(){
		System.out.println("Test7");
	}
	
	
	@Test (groups="Sanity")
	public void Test8(){
		System.out.println("Test8");
	}
	
	
	
	@Test (groups="Smoke")
	public void Test9(){
		System.out.println("Test9");
	}
	
	
	@Test (groups="Regression")
	public void Test10(){
		System.out.println("Test10");
	}
	
	
	
	@Test (groups="Smoke")
	public void Test11(){
		System.out.println("Test11");
	}
	
	
	
	@Test (groups="Sanity")
	public void Test12(){
		System.out.println("Test12");
	}
	
	
	
	@Test (groups="Sanity")
	public void Test13(){
		System.out.println("Test13");
	}
	
	
	
}

