package My_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrometest {

	public static void main(String args[]) {
		try {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\ChromeDriver75\\chromedriver_win32\\chromedriver.exe"); WebDriver
		 * driver=new ChromeDriver();
		 */
			
			System.setProperty("webdriver.chrome.driver","E:\\BrowserDrivers\\chromedriver75\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.youtube.com/");
	}
	     catch(Exception e) {
		System.out.println(e.getMessage());
	        }
}
}
