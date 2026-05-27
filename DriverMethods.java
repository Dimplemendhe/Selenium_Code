package batch66programs;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver1 = new EdgeDriver();
		// getURL
		driver.get("https://www.Amazon.com");
		Thread.sleep(2000);
		//gettitle
		String title = driver.getTitle();
		System.out.println(title);
		//getCurrentURL
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//getWindowHandle
		String ParentID = driver.getWindowHandle();
		System.out.println(ParentID);
		//getWindowHandles
		Set<String> PID = driver.getWindowHandles();
		System.out.println(PID);
		
		
		
	}

}
