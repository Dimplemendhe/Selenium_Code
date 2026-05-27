package batch66programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechRegistrationEnabled {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Firstname = driver.findElement(By.id("firstName"));
		if(Firstname.isDisplayed()&&Firstname.isEnabled())
		{
			Firstname.sendKeys("Dimple");
		}
		else
		{
			System.out.println("Cant perform any action as the element is not displayed and enabled");
		}
		WebElement Lastname = driver.findElement(By.id("lastName"));
		if(Lastname.isDisplayed()&& Lastname.isEnabled())
		{
			Lastname.sendKeys("Mendhe");
		}
		else
		{
			System.out.println("Cant perform any action as element is not displayed and Enabled");
		}
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
