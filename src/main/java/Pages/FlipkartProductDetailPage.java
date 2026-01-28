package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class FlipkartProductDetailPage {

    private WebDriver driver;

    private By addToCartButton =
            By.className("IUmgrZ");

    public FlipkartProductDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddToCart() {
        WaitUtils.waitForElement(driver, addToCartButton, 10);
        driver.findElement(addToCartButton).click();
    }
}

