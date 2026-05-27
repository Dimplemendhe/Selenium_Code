package batch66programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonlinkCount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int count = list.size();
		System.out.println(count);
		
	}

}
