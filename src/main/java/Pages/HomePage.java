package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    
    // Locators
    private By loginLink = By.linkText("Log in");
    private By registerLink = By.linkText("Register");
    private By shoppingCart = By.cssSelector(".ico-cart");
    private By searchField = By.id("small-searchterms");
    private By searchButton = By.cssSelector("input[value='Search']");
    private By productItems = By.cssSelector(".product-item");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void clickLogin() {
        driver.findElement(loginLink).click();
    }
    
    public void clickRegister() {
        driver.findElement(registerLink).click();
    }
    
    public void searchForProduct(String productName) {
        driver.findElement(searchField).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
    
    public boolean isCartVisible() {
        return driver.findElement(shoppingCart).isDisplayed();
    }
    
    public String getPageTitle() {
        return driver.getTitle();
    }
    
    public int getProductCount() {
        List<WebElement> products = driver.findElements(productItems);
        return products.size();
    }
}
