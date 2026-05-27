package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLoginXPath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement Account = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Account).perform();
		WebElement Signin = driver.findElement(By.xpath("//span[text()='Sign in']"));
		Signin.click();
	    WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
	    Email.sendKeys("9527050463");
	    WebElement Continue = driver.findElement(By.xpath("//input[@type='submit']"));
	    Continue.click();
	    WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
	    Password.sendKeys("dimple123");
	    WebElement SignIn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	    SignIn.click();
	}

}
