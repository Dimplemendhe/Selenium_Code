package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCustomerServicePartiallink {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Service = driver.findElement(By.partialLinkText("Service"));
		Service.click();

	}

}
