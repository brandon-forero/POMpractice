package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShoppingCartPage;
import utils.baseTest.BaseTest;

public class RemoveCartItemsTest extends BaseTest {

    ShoppingCartPage shoppingCartPage;

    @Test
    public void removeCartItems() {

        inventoryPage.purchaseRandomItems();
        shoppingCartPage = inventoryPage.navigateToShoppingCart();
        shoppingCartPage.removeCartItems();
        Assert.assertEquals(shoppingCartPage.getCartItemsNumber(), 0);

    }


}
