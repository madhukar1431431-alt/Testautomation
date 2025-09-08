package Test;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	public static void takescreenshot(WebDriver driver,String filename)
	{
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File dest = new File("./screenshots/" + filename + ".png");
		  try {
	            FileHandler.copy(src, dest);
	            System.out.println("Screenshot saved at: " + dest.getAbsolutePath());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}

}
