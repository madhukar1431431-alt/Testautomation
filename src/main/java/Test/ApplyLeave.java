package Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyLeave {
	public static void leave(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[contains(@href,'leave')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[1]")).sendKeys("2021-01-02");
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")).sendKeys("2022-01-02");
		List<String>st=Arrays.asList("Taken","Cancelled");
		for(String expected:st)
		{
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		List<WebElement>list=driver.findElements(By.xpath("//div[@role='option']//span"));
		for(WebElement li:list)
		{
			String txt=li.getText().trim();
			if(txt.equalsIgnoreCase(expected))		
			{				
				li.click();
				System.out.println("Clicked: " + expected);
	            break;
		}
		}
		}
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span")));
		List<WebElement>list1=driver.findElements(By.xpath("//div[@role='option']//span"));
		for (WebElement li1:list1)
		{
			String txt1=li1.getText().trim();
			if(txt1.equalsIgnoreCase("CAN - Matternity"))
			{
				li1.click();
				break;
				}
			
		}
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("m");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span")));
		List<WebElement>list3=driver.findElements(By.xpath("//div[@role='option']//span"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("oxd-toaster_1")));
			for (WebElement li3:list3)
			{
				String txt3=li3.getText().trim();
				System.out.println(txt3);
				if(txt3.equalsIgnoreCase("DEVIL AND AMEEN"))
				{
					li3.click();
					break;
					}
				
				
		}
			driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[3]")).click();
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']//span")));
			List<WebElement>list4=driver.findElements(By.xpath("//div[@role='option']//span"));
			for (WebElement li4:list4)
			{
				String txt4=li4.getText().trim();
				if(txt4.equalsIgnoreCase("Engineering"))
				{
					li4.click();
					break;
				}
				
			}
			driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
		
	}



