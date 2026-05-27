package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTechRegistrationDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Firstname = driver.findElement(By.id("firstName"));
		Firstname.sendKeys("Dimple");
		Firstname.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(3000);
		//Actions a1 = new Actions(driver);
		//a1.doubleClick(Firstname).perform();
		Firstname.sendKeys(Keys.CONTROL+"C");
		WebElement Lastname = driver.findElement(By.id("lastName"));
		Lastname.sendKeys(Keys.CONTROL+"V");

	}

}
