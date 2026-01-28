package tests;

import Pages.FlipkartSearchPage;
import org.testng.annotations.Test;

import java.util.List;

public class FlipkartSearchTest extends BaseTest{

    @Test
    public void testSearchProduct() throws InterruptedException {
        FlipkartSearchPage flipkartSearchPage = new FlipkartSearchPage(driver);

        flipkartSearchPage.searchForProduct("iphone");

        List<String> iphones = flipkartSearchPage.getIphoneNamesWithPrices();

        for (String iphone : iphones) {
            System.out.println(iphone);
        }
    }
}
