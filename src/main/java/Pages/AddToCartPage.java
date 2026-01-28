package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitUtils;

import java.time.Duration;

public class AddToCartPage {
    private WebDriver driver;

    // Locators
    private By searchField = By.name("q");
    private By popCross = By.className("b3wTlE");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeLoginPopupIfPresent() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement closeBtn = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(popCross)
            );
            closeBtn.click();
        } catch (TimeoutException e) {
            // Popup not present, continue test
        }
    }

    public void searchForProduct(String productName) {
        WebElement searchBox = WaitUtils.waitForElement(driver, searchField, 10);

        searchBox = driver.findElement(searchField);

        searchBox.clear();
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("Search using ENTER key for: " + productName);
    }
}
