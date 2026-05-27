package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement SearchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		SearchTextBox.sendKeys("shoes");
		// Using Click on Search icon
		WebElement SearchingProduct = driver.findElement(By.id("nav-search-submit-button"));
		SearchingProduct.click();
		
		}

}
