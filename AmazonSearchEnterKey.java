package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchEnterKey {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement SearchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		//WebElement SearchTextBox = driver.findElement(By.xpath("//input[@placeholder = 'Search Amazon.in']"));
		WebElement SearchTextBox = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		//WebElement SearchTextBox = driver.findElement(By.xpath("//input[@role = 'searchbox']"));
		SearchTextBox.sendKeys("Shoes"+Keys.ENTER);
		
	}

}
