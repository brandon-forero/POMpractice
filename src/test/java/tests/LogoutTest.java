package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MenuBar;
import utils.baseTest.BaseTest;

public class LogoutTest extends BaseTest {

    MenuBar menuBar;
    LoginPage loginPage;

    @Test
    public void logoutTest(){

        menuBar = inventoryPage.openMenuBar();
        loginPage = menuBar.logout();
        Assert.assertTrue(loginPage.loginLogoIsPresent());

    }

}
