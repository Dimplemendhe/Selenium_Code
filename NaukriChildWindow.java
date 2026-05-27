package batch66programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Google = driver.findElement(By.xpath("//span[text()= 'Google']"));
		Google.click();
		Set<String> pcid = driver.getWindowHandles();
		System.out.println(pcid);
		//Output = [9D0B7DC12DE535D4A5AAC3328B83E51E, 9591C7FCD8BAFA7F11AAB77361196ABF]
        Iterator<String> IP = pcid.iterator();
        String pid = IP.next();
        	String cid = IP.next();
        	driver.switchTo().window(cid);
        	Thread.sleep(3000);
        	
        	driver.close();
	}

}


