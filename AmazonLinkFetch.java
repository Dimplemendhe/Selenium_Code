package batch66programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkFetch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(int i=0; i<list.size(); i++)
		{
			WebElement e2 = list.get(i);
			String Text = e2.getText();
			System.out.println(Text);
			
		}

	}

}
