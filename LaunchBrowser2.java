package batch66programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.com");
		driver.getTitle();
	}

}
