package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEmailAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/business/register/org/landing?ref_=ab_reg_signin_unifiedauth");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Relative Xpath of email - //input[@id='businessEmail-field-id']
		
WebElement Email = driver.findElement(By.xpath("//input[@id='businessEmail-field-id']"));
Email.sendKeys("dimplemendhe1996@gmail.com");
	}

}
