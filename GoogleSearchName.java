package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement SearchBox = driver.findElement(By.name("q"));
		WebElement SearchBox = driver.findElement(By.xpath("//textarea[@name = 'q']"));
		SearchBox.sendKeys("India Country"+Keys.ENTER);

	}

}
