package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class LoginPage {
    private WebDriver driver;
    
    // Locators
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.cssSelector("input[value='Log in']");
    private By errorMessage = By.cssSelector(".validation-summary-errors");
    private By logoutLink = By.linkText("Log out");
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }
    
    public boolean isLoggedIn() {
        try {
            return WaitUtils.waitForElement(driver, logoutLink, 3).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    
    public String getErrorMessage() {
        return WaitUtils.waitForElement(driver, errorMessage, 5).getText();
    }
}
