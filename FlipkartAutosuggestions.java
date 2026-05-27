package batch66programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutosuggestions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cross = driver.findElement(By.xpath("//span[text()='✕']"));
		cross.click();
		WebElement searchbox = driver.findElement(By.xpath("//input[@title = 'Search for Products, Brands and More']"));
		searchbox.sendKeys("shoes");
		List<WebElement>list = driver.findElements(By.xpath(""));
		int count = list.size();
		System.out.println(count);
		list.get(count-2).click();
	}

}
