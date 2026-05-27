package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMindChatBotIframe {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("chat-bot-launcher-button")).click();
		WebElement iframe = driver.findElement(By.id("chat-bot-iframe"));
		driver.switchTo().frame(iframe);
		Thread.sleep(6000);
		driver.findElement(By.id("textInput")).sendKeys("Dimple" +Keys.ENTER);
		//Back to Parent window 
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//ul[@id='menu-1-10edec5']/li[2]")).click();

	}

}
