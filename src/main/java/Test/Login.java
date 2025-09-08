package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    
    public static void loginhome(WebDriver driver, String username, String password) throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
       
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(100);
        screenshot.takescreenshot(driver, "Loginpage");
        
    }
}
