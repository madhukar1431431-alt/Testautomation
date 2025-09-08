package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newuser {
	public static void user(WebDriver driver)
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement add=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span[text()='Admin']")));
		add.click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("m");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']")));
		List<WebElement>suggesitions=driver.findElements(By.xpath("//div[@role='option']//span"));
		for(WebElement sug:suggesitions)
		{
			   String text = sug.getText().trim();
			   if(!text.equalsIgnoreCase("Searching....")&& !text.isEmpty())
			   {
				   System.out.println("sugg:" + text);
				   if(text.equalsIgnoreCase("Timothy Lewis Amiano"))
				   {
					   sug.click();
					   break;
				   }
			   }
			
		}
		WebElement dropdown =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")));
		dropdown.click();
		WebElement Enable=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span[text()='Enabled']")));
		Enable.click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Madhukar1");

		WebElement pass=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='password'])[1]")));
		
		pass.sendKeys("Madhu@123");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("Madhu@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
	}

		
	}

	
