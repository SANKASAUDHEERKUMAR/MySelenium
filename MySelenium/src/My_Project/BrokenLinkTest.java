package My_Project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinkTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\Browser Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		 //WebDriverManager.chromedriver().setup();
		WebDriver driver=new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//Click on gmail link and signin link
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Sign in")).click();
		
		//Window handles 
		  List<String> Wind=new ArrayList<>(driver.getWindowHandles());
		  System.out.println(driver.switchTo().window(Wind.get(1)));
		 
		  // Explicit wait for WebElement
		WebDriverWait wait = new WebDriverWait(driver, 120); //input[@id='identifierId']
		WebElement element =
				 wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
		
		element.sendKeys("sudheerssk90@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement PasswordClk=wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		PasswordClk.sendKeys("AMMAnana90");

				driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//1. Get the list of all links and images:
		 List<WebElement> Linktags=driver.findElements(By.tagName("a"));
		 Linktags.addAll(driver.findElements(By.tagName("img")));
		 
		 
		 System.out.println("Total no of links and images: "+Linktags.size());
		 List<WebElement> activelinks=new ArrayList<WebElement>();
		 
		 //2 iterate of Linktags
		 Thread.sleep(3000);
		 for (int i = 0; i < Linktags.size(); i++) {
			driver.navigate().refresh();
			  if(Linktags.get(i).getAttribute("src") !=null && Linktags.get(i).getAttribute("src").contains("javascript") && Linktags.get(i).getAttribute("href") !=null) {
				  activelinks.add(Linktags.get(i));
				  System.out.println(Linktags.get(i));
			  }
		}
		 
		 System.out.println("Total no of active links and images: "+activelinks.size());
		 
		 // 3. Check the href url , with httpconnection api:
		/*
		 * 200-- ok 400-- Bad Request 404-- not found 500 Server side Error
		 */
		 
		 for (int j = 0; j < activelinks.size(); j++) {
			HttpURLConnection connection= (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String Response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"--->"+Response);
		}
		 
		 
	}

}
