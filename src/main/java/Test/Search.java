package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	public static void Search(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath
				("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement dropdown=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][1]")));
		dropdown.click();
		WebElement admin=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span[text()='Admin']")));
		admin.click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("manda");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']")));
		List<WebElement>suggesitions=driver.findElements(By.xpath("//div[@role='option']//span"));
		for(WebElement sug:suggesitions)
		{
			   String text = sug.getText().trim();
			   if(!text.equalsIgnoreCase("Searching....")&& !text.isEmpty())
			   {
				   System.out.println("sugg:" + text);
				   if(text.equalsIgnoreCase("manda akhil user"))
				   {
					   sug.click();
					   break;
				   }
			   }
			
		}
		
		
		
		WebElement dropdown2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='User Role']/following::div[@class='oxd-select-text-input'][2]")));
		dropdown2.click();
		WebElement Enabled=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span[text()='Enabled']")));
		Enabled.click();
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}

}
