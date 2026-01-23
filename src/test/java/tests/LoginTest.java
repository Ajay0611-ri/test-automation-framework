package tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    
    @Test
    public void testValidLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser@example.com", "password123");

//        Assert.assertTrue(loginPage.isLoggedIn(), "User should be logged in");
    }
    
    @Test
    public void testInvalidLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("invalid@email.com", "wrongpassword");
        
        String error = loginPage.getErrorMessage();
        Assert.assertTrue(error.contains("Login was unsuccessful for now"),
                         "Should show error message");
    }
}
