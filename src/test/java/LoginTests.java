import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;


public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Basarili kullanici girisi")
    public void LoginSuccesfullControl(){
        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();
        homePage.accountControl("Welcome " + username);

    }

    @Test(description = "Basarisiz kullanici girisi")
    public void LoginUnsuccessfullControl(){

            loginPage.fillUsername(username)
                    .fillPassword("password")
                    .clickLogin();

            mainPage.errorControlMessage("The username and password could not be verified.");

    }

    @Test(description = "Required kontrolu")
    public void LoginRequiredControl(){

        loginPage.fillUsername("")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUsername(username)
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome " + username);

    }

}
