package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CheckoutStep1Page extends BasePage {

    public CheckoutStep1Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(id = "continue")
    private WebElement continueButton;

    public void fillCheckoutInformation(String firstName, String lastName, String postalCode) {

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(postalCode);

    }

    public CheckoutStep2Page continueCheckout() {
        continueButton.click();
        return new CheckoutStep2Page(super.getDriver());
    }
}
