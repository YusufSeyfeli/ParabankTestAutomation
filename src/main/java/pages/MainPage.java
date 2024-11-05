package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTest {


    @Step("Hata mesaji kontrolu")
    public MainPage errorControlMessage(String message) {

        String text = driver.findElement(By.cssSelector("[class='error']")).getText();
        Assert.assertEquals(message,text);
        return this;
    }

}
