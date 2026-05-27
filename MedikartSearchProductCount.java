package batch66programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MedikartSearchProductCount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.1mg.com");
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search for Medicines and Health Products']"));
		searchbox.sendKeys("Limcee" +Keys.ENTER) ;
		List<WebElement> list = driver.findElements(By.className("flex SearchResultContainer__cardContainer__dgEls col-5 SearchResultContainer__noMargin__GAbbc"));
		int count = list.size();
		System.out.println(count);
	}

}
