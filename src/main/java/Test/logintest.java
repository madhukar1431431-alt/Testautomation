package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class logintest {

    @DataProvider(name = "excelData")
    public Object[][] getExcelData() throws Exception {
        String path = "D:\\java\\data\\readexcel.xlsx";  // update path
        return readexcel.getData(path, "Sheet1");
    }

    @Test(dataProvider = "excelData")
    public static void testLogin(String username, String password) {
        WebDriver driver = new ChromeDriver();
        Login.loginhome(driver, username, password);
        //driver.quit();
    }
}
