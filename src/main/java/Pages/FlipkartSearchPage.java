package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FlipkartSearchPage {
    private WebDriver driver;

    // Locators
    private By searchField = By.name("q");
    private By productNames = By.className("RG5Slk");
    private By productPrices = By.className("DeU9vF");

    private By popCross = By.className("b3wTlE");
    public FlipkartSearchPage(WebDriver driver) {
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
    public void searchForProduct(String productName) throws InterruptedException {
        WebElement searchBox = WaitUtils.waitForElement(driver, searchField, 10);

        searchBox = driver.findElement(searchField);

        searchBox.clear();
        searchBox.sendKeys(productName);
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("Search using ENTER key for: " + productName);
    }
    // Get all iPhone names with prices
    public List<String> getIphoneNamesWithPrices() {

        List<WebElement> names = driver.findElements(productNames);
        List<WebElement> prices = driver.findElements(productPrices);

        List<String> iphoneDetails = new ArrayList<>();

        int count = Math.min(names.size(), prices.size());

        for (int i = 0; i < count; i++) {
            String name = names.get(i).getText();
            String price = prices.get(i).getText();

            iphoneDetails.add(name + " - " + price);
        }

        return iphoneDetails;
    }
}
