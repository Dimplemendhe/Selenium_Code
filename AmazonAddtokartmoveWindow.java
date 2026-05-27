package batch66programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddtokartmoveWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Toys");
		Thread.sleep(3000);
		List<WebElement> list  = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	    int count = list.size();
	    System.out.println(count);
	    list.get(count-2).click();
	    Thread.sleep(3000);
	    WebElement product = driver.findElement(By.xpath("//span[text()='Toyzone Baby Panda Kids Magic Car/Swing Car Ride On -Multicolour']"));
	    product.click();
	    Thread.sleep(3000);
	    Set<String> Pcid = driver.getWindowHandles();
	    Iterator<String> IP = Pcid.iterator();
	    String Pid = IP.next();
	    	String Cid = IP.next();
	    	driver.switchTo().window(Cid);
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("add-to-cart-button")).click();
	    	driver.findElement(By.name("proceedToRetailCheckout")).click();
	    	
	
	}

}
