package tests;

import Pages.AddToCartPage;
import Pages.FlipkartProductDetailPage;
import Pages.FlipkartSearchResultsPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{

    @Test
    public void testSearchProduct() throws InterruptedException {
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.searchForProduct("iphone");

        FlipkartSearchResultsPage flipkartSearchResultsPage = new FlipkartSearchResultsPage(driver);
        flipkartSearchResultsPage.clickProductAndSwitchToNewTab(1);

        FlipkartProductDetailPage flipkartProductDetailPage = new FlipkartProductDetailPage(driver);
        flipkartProductDetailPage.clickAddToCart();
    }
}