package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CheckoutStep2Page extends BasePage {

    public CheckoutStep2Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "finish")
    private WebElement finishButton;

    public CompletedCheckoutPage finishPurchase() {

        finishButton.click();
        return new CompletedCheckoutPage(super.getDriver());

    }
}
