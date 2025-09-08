package Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
	       Login.loginhome(driver,"Admin", "admin123");
		//newuser.user(driver);
		//Search.Search(driver);
		//ApplyLeave.leave(driver);
		}

	
}
