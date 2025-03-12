package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class MenuBar extends BasePage {

    public MenuBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "bm-burger-button")
    private WebElement menuButton;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public LoginPage logout() {

        waitElementVisibility(logoutButton);
        logoutButton.click();

        return new LoginPage(super.getDriver());
    }
}
