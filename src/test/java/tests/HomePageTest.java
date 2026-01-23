package tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    
    @Test
    public void testHomePageLoads() {
        HomePage homePage = new HomePage(driver);
        
        Assert.assertTrue(homePage.isCartVisible(), "Shopping cart should be visible");
        Assert.assertTrue(homePage.getPageTitle().contains("Demo Web Shop"), 
                         "Page title should contain site name");
    }
    
    @Test
    public void testSearchProduct() {
        HomePage homePage = new HomePage(driver);
        
        homePage.searchForProduct("computer");
        
        int productCount = homePage.getProductCount();
        Assert.assertTrue(productCount > 0, "Should find products");
    }
}
