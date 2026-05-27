package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAllDropdown {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement All = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select s1 = new Select(All);
        //s1.selectByIndex(2);//Amazon Devices
        s1.selectByValue("search-alias=appliances");//Appliances
        //s1.selectByVisibleText("Computers & Accessories");
        
	}

}
