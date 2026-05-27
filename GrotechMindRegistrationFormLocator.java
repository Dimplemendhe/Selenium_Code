package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechMindRegistrationFormLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Dimple");
		WebElement Lastname = driver.findElement(By.id("lastName"));
		Lastname.sendKeys("Mendhe");
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("dimplemendhe1996@gmail.com");
		WebElement Phone = driver.findElement(By.name("phone"));
		Phone.sendKeys("9527050463");
		WebElement Aadhar = driver.findElement(By.id("aadhaar"));
		Aadhar.sendKeys("588266025089");
		WebElement Pan = driver.findElement(By.name("pan"));
		Pan.sendKeys("BXRPM2260B");
		WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s1 = new Select(gender);
		s1.selectByVisibleText("Female");
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select s2 = new Select(state);
		s2.selectByValue("maharashtra");
		
		WebElement AgreeCheckbox = driver.findElement(By.id("c_bs_1"));
		if(AgreeCheckbox.isSelected())
		{
			System.out.println();
		}
		else
		{
			AgreeCheckbox.click();
		}
		
	}

}
