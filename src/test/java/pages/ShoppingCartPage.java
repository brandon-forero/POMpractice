package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

import java.util.List;

public class ShoppingCartPage extends BasePage {

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(className = "cart_button")
    private List<WebElement> removeButtonsList;

    @FindBy(className = "cart_item")
    private List<WebElement> cartItems;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutStep1Page checkout() {
        checkoutButton.click();
        return new CheckoutStep1Page(super.getDriver());
    }

    public void removeCartItems() {
        for(WebElement removeButton : removeButtonsList){
            removeButton.click();
        }
    }

    public int getCartItemsNumber() {
        return cartItems.size();
    }
}
