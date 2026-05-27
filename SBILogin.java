package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBILogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.sbi.bank.in/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//a[@class='login_button']"));
		login.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("dimplemendhe");
		WebElement password  = driver.findElement(By.name("password"));
		password.sendKeys("Dimple123");
	
	
	}

}
