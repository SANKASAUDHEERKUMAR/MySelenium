package My_Project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brokenlinks_40Funk {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","E:\\Browser Drivers\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.40funk.com/");
		
		List<WebElement> Linktags=driver.findElements(By.tagName("a"));
		Linktags.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Total no of Links and Images: "+Linktags.size());
		
		List<WebElement> Activelinks=new ArrayList<>();
		for (int i = 0; i < Linktags.size(); i++) {
			if (Linktags.get(i).getAttribute("href")!=null) {
				Activelinks.add(Linktags.get(i));
				System.out.println(Linktags.get(i));
			}
		}
		
		System.out.println("Total no of Active links: "+Activelinks.size());
		
		for (int i = 0; i < Activelinks.size(); i++) {
			HttpURLConnection connection=(HttpURLConnection)new URL(Activelinks.get(i).getAttribute("href")).openConnection();
			connection.connect();
			String Response=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(Activelinks.get(i).getAttribute("href")+"---->-"+Response);
		}
	}
}
