package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends BaseLibrary{
    @BeforeMethod
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=CC3CDB7F5C48F412A6DB109DBB70F2FB");

    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}
