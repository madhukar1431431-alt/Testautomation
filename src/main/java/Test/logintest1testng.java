package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(TestNGListeners.class) 
public class logintest1testng {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        Login.loginhome(driver, "Admin", "admin123");
    }

    @Test(priority = 2)
    public void testNewUser() throws InterruptedException {
        newuser.user(driver);
    }

    @Test(priority = 3)
    public void testSearch() throws InterruptedException {
        Search.Search(driver);
    }

    @Test(priority = 4)
    public void testApplyLeave() throws InterruptedException {
        ApplyLeave.leave(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
