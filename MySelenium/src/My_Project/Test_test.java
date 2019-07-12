package My_Project;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_test {

	
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Before test");
	}
	
	@BeforeGroups
	public void beforeGroup(){
		System.out.println("Before Group1");
	}
	
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Before Method");
	}
	
	@Test (groups="Regression")
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	
	@Test
	public void Test2(){
		System.out.println("Test2");
	}
	

	@Test(groups="Sanity")
	public void Test3(){
		System.out.println("Test3");
	}
}
