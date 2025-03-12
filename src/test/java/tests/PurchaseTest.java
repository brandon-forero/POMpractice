package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CheckoutStep1Page;
import pages.CheckoutStep2Page;
import pages.CompletedCheckoutPage;
import pages.ShoppingCartPage;
import utils.baseTest.BaseTest;

public class PurchaseTest extends BaseTest {

    ShoppingCartPage shoppingCartPage;
    CheckoutStep1Page checkoutStep1Page;
    CheckoutStep2Page checkoutStep2Page;
    CompletedCheckoutPage completedCheckoutPage;

    @Test
    @Parameters({"firstName", "lastName", "postalCode", "confirmationMessage"})
    public void randomPurchaseTest(String firstName, String lastName, String postalCode, String confirmationMessage) {

        inventoryPage.purchaseRandomItems();
        shoppingCartPage = inventoryPage.navigateToShoppingCart();
        checkoutStep1Page = shoppingCartPage.checkout();
        checkoutStep1Page.fillCheckoutInformation(firstName, lastName, postalCode);
        checkoutStep2Page = checkoutStep1Page.continueCheckout();
        completedCheckoutPage = checkoutStep2Page.finishPurchase();
        Assert.assertEquals(confirmationMessage, completedCheckoutPage.getCheckoutMessage());

    }



}
