package batch66programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("India Country");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']/li"));
		int count = list.size();
		System.out.println(count);
		list.get(count-1).click();

	}

}
