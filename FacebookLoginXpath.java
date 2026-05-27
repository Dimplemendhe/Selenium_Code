package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement username = driver.findElement(By.name("email"));
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("dimplemendhe303@gmail.com");
		//WebElement Password = driver.findElement(By.name("pass"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		Password.sendKeys("Dimple303" +Keys.ENTER);
		

	}

}
