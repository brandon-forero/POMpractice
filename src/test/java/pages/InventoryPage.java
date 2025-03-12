package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InventoryPage extends BasePage {


    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "btn")
    private List<WebElement> inventoryButtonsList;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartButton;

    @FindBy(className = "bm-burger-button")
    private WebElement menuButton;



    public void purchaseRandomItems() {

        List<WebElement> buttonsToClick = new ArrayList<>(inventoryButtonsList);
        Random random = new Random();

        for (int i = 0; i < 3; i++) {

            WebElement button = buttonsToClick.get(random.nextInt(buttonsToClick.size()));
            button.click();
            buttonsToClick.remove(button);

        }
    }

    public ShoppingCartPage navigateToShoppingCart() {

        shoppingCartButton.click();
        return new ShoppingCartPage(super.getDriver());

    }

    public MenuBar openMenuBar() {
        menuButton.click();
        return new MenuBar(super.getDriver());
    }

}
