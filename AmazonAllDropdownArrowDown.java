package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllDropdownArrowDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement All = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);
		All.sendKeys(Keys.ARROW_DOWN);//Amazon Fashion
		
	}

}
