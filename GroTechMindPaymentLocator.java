package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMindPaymentLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/payments/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement CardNo = driver.findElement(By.id("cardNumber"));
		CardNo.sendKeys("255689954557");
		
		WebElement ExpiryDate = driver.findElement(By.id("expiryDate"));
		ExpiryDate.sendKeys("03/30");
		
		WebElement CVV = driver.findElement(By.name("cvv"));
		CVV.sendKeys("322");
		
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("1200");
		
		/*WebElement currency = driver.findElement(By.id("currency"));
		currency.sendKeys("1542");*/
	}

}
