package My_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {

	WebDriver driver=null;
	String Chromepath="E:\\Sudheerkumar\\Selenium\\Softwares\\Drivers\\chromedriver.exe";
	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",Chromepath);
		Thread.sleep(3000);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}
	
	@Test(dataProvider="getDatafromDataProvider")
	public void Dataprovidertest(String Author, String searchKey) throws Exception {
	
		WebElement searchText=driver.findElement(By.name("q"));
		searchText.sendKeys(searchKey);
		System.out.println("Welcome ->"+Author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        System.out.println(testValue +"::::"+searchKey);
        searchText.clear();
        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey)); 
	}
	
	@DataProvider
	public Object[][] getDatafromDataProvider(){
		return new Object[][] {
			{ "Guru99", "India" },
            { "Krishna", "UK" },
            { "Bhupesh", "USA" }
        };
		
	}
}
