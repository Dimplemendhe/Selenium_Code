package batch66programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
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
	    WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Toys" +Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='a-section a-spacing-base desktop-grid-content-view']"));
		allProduct.get(0).click();
	    Thread.sleep(3000);
	    Set<String> Pcid = driver.getWindowHandles();
	    Iterator<String> IP = Pcid.iterator();
	    String Pid = IP.next();
	    	String Cid = IP.next();
	    	driver.switchTo().window(Cid);
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("add-to-cart-button")).click();
	    	driver.findElement(By.name("proceedToRetailCheckout")).click();
	    	Thread.sleep(3000);
	    	//WebElement Continue2 = driver.findElement(By.xpath("//input[@type='submit']"));
	    	//Continue2.click();
	    	Thread.sleep(3000);
	    WebElement RedioButton = driver.findElement(By.xpath("//input[@value='SelectableAddCreditCard']"));
	    RedioButton.click();
	    WebElement Creditcardlink = driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']"));
	    Creditcardlink.click();
	    Thread.sleep(3000);
	    WebElement iframe = driver.findElement(By.id("pp-UqEiPZ-144"));
	    driver.switchTo().frame(iframe);
	    Thread.sleep(3000);
	    driver.findElement(By.name("addCreditCardNumber")).sendKeys("123456789");
	    
	    
	
	
	}
	

}
