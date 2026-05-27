package batch66programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Searchbox = driver.findElement(By.xpath("//input[@role='searchbox']"));
		Searchbox.sendKeys("Toys");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		int count = list.size();
		System.out.println(count);
		list.get(count-2).click();
		WebElement product = driver.findElement(By.xpath("//span[text()='Toyzone Baby Panda Kids Magic Car/Swing Car Ride On -Multicolour']"));
		product.click();
		//Thread.sleep(3000);
		//WebElement AddtoKart = driver.findElement(By.name("submit.add-to-cart"));
		//AddtoKart.click();

	}

}
