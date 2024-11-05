package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseTest {


    @Step("Kullanici kontrolu")
    public HomePage accountControl(String value) {

        String Text = driver.findElement(By.cssSelector("[class='smallText']")).getText();
        Assert.assertEquals(value,Text);

        return this;
    }

    @Step("Kullanici olusturma kontrolu")
    public HomePage registerControl(String value) {

        String Text = driver.findElement(By.cssSelector("[class='title']")).getText();
        Assert.assertEquals(value,Text);

        return this;
    }
}