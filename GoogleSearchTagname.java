package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTagname {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement SearchText = driver.findElement(By.tagName("textarea"));
		SearchText.sendKeys("India Country");

	}

}
