package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CompletedCheckoutPage extends BasePage {

    public CompletedCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "complete-header")
    private WebElement completeCheckoutMessage;

    public String getCheckoutMessage() {

        return  completeCheckoutMessage.getText();

    }

}
