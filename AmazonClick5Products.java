package batch66programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClick5Products {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://Www.Amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Facewash");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        int count = list.size();
        list.get(count-5).click();
        List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base desktop-grid-content-view']"));
        for(int i=0;i<5;i++)
        {
                allProduct.get(i).click();
                
        }
        Set<String> pcid = driver.getWindowHandles();
        List<String> alllist = new ArrayList<>(pcid);
        
        driver.switchTo().window(alllist.get(3));
        
	}

}
