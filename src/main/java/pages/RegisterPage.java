package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {


    @Step("First Name alani doldurulur")
    public RegisterPage  fillFirstName (String firstName) {

        driver.findElement(By.id("customer.firstName")).sendKeys(firstName);
        return this;
    }
    @Step("Last Name alani doldurulur")
    public RegisterPage  fillLastName (String lastName) {

        driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
        return this;
    }
    @Step("Address alani doldurulur")
    public RegisterPage  fillAddress (String address) {

        driver.findElement(By.id("customer.address.street")).sendKeys(address);
        return this;
    }

    @Step("City alani doldurulur")
    public RegisterPage  fillCity (String city) {

        driver.findElement(By.id("customer.address.city")).sendKeys(city);
        return this;
    }

    @Step("State alani doldurulur")
    public RegisterPage  fillState (String state) {

        driver.findElement(By.id("customer.address.state")).sendKeys(state);
        return this;
    }

    @Step("Zipcode alani doldurulur")
    public RegisterPage  fillZipCode (String zipCode) {

        driver.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
        return this;
    }

    @Step("Phone number alani doldurulur")
    public RegisterPage  fillPhoneNumber (String phoneNumber) {

        driver.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
        return this;
    }

    @Step("SSN alani doldurulur")
    public RegisterPage  fillSsn (String ssn) {

        driver.findElement(By.id("customer.ssn")).sendKeys(ssn);
        return this;
    }

    @Step("Username alani doldurulur")
    public RegisterPage  fillUsername (String username) {

        driver.findElement(By.id("customer.username")).sendKeys(username);
        return this;
    }

    @Step("Password alani doldurulur")
    public RegisterPage  fillPassword (String password) {

        driver.findElement(By.id("customer.password")).sendKeys(password);
        screenshot();
        return this;
    }

    @Step("Confirm alani doldurulur")
    public RegisterPage  fillConfirm (String confirm) {

        driver.findElement(By.id("repeatedPassword")).sendKeys(confirm);
        return this;
    }

    @Step("Register butonu tiklanir")
    public RegisterPage  clickRegister () {

        driver.findElement(By.cssSelector("[value='Register']")).click();
        return this;
    }


}

