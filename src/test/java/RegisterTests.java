import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    HomePage homePage = new HomePage();

    @Test(description = "Kullanici olusturma kontrolu")
    public void LoginSuccesfullControl(){


        String userName = createUserName();

        loginPage.clickRegister();
        

        registerPage.fillFirstName("Test")
                .fillLastName("Test")
                .fillAddress("Test")
                .fillCity("Test")
                .fillState("Test")
                .fillZipCode("Test")
                .fillPhoneNumber("Test")
                .fillSsn("Test")
                .fillUsername(userName)
                .fillPassword("Test")
                .fillConfirm("Test")
                .clickRegister();

        homePage.registerControl("Welcome " + userName);

    }
}
