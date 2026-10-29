package test;

import org.testng.annotations.Test;

import com.sicagolf.pages.LoginPage;
import com.sicagolf.utils.ConfigReader;

import base.BaseTest;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        String email = ConfigReader.getProperty("user.email");
        String password = ConfigReader.getProperty("user.password");
        // Ejecutamos la acción de login
        loginPage.typeEmail(email)
                .typePassword(password)
                .clickLogin();
    }
}
