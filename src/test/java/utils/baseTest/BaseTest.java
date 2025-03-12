package utils.baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.InventoryPage;
import pages.LoginPage;
import utils.MyDriver;

    public class BaseTest {

        MyDriver driver;
        protected InventoryPage inventoryPage;


        @BeforeMethod(alwaysRun = true)
        @Parameters({ "browser", "url" })
        public void beforeMethod(String browser, String url) {
            driver = new MyDriver(browser);
            driver.getDriver().manage().window().maximize();
            navigateTo(url);
            LoginPage loginPage = loadLoginPage();
            inventoryPage = loginPage.login();

        }

    /**
     * Navigates to given URL
     *
     * @param url
     * @author f.jimenez
     */
    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }

    public LoginPage loadLoginPage() {
        return new LoginPage(driver.getDriver());
    }

    /**
     * After the test execution it closes the browser.
     *
     * @author f.jimenez
     */
    @AfterMethod()
    public void afterMethod() {
        driver.getDriver().close();
    }

}
