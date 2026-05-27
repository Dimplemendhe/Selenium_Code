package batch66programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddtoKartmoveWindow2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchbox.sendKeys("facewash");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count = list.size();
		System.out.println(count);
		list.get(count-5).click();
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base desktop-grid-content-view']"));
		allProduct.get(0).click();
		Thread.sleep(3000);
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> IP = pcid.iterator();
		String Pid = IP.next();
		String Cid = IP.next();
		driver.switchTo().window(Cid);
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
	}

}
