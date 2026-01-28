package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartSearchResultsPage {

    private WebDriver driver;

    private By productTitles = By.className("RG5Slk");

    public FlipkartSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String clickProductAndSwitchToNewTab(int index) {

        String parentWindow = driver.getWindowHandle();

        driver.findElements(productTitles).get(index).click();

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        return parentWindow;
    }
}