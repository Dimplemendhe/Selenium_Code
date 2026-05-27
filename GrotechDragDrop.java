package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GrotechDragDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Source = driver.findElement(By.id("drag2"));
		WebElement Target = driver.findElement(By.id("div2"));
	    Actions a1 = new Actions(driver);
	    a1.dragAndDrop(Source, Target).perform();
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	
	}

}
