package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(id = "login_credentials")
    private WebElement loginCredentials;

    @FindBy(className = "login_password")
    private WebElement loginPassword;

    @FindBy(className = "login_wrapper")
    private WebElement loginLogo;

    public String getStandardUser() {
        String allUsers = loginCredentials.getText();
        String[] standardUser = allUsers.split("\n");
        return standardUser[1];
    }

    public String getPassword() {
        String passwordsLines = loginPassword.getText();
        String[] lines = passwordsLines.split("\n");
        return lines[1];
    }

    public InventoryPage login() {
        userNameInput.sendKeys(getStandardUser());
        passwordInput.sendKeys(getPassword());
        loginButton.click();
        return new InventoryPage(super.getDriver());
    }

    public Boolean loginLogoIsPresent() {
        return loginLogo.isDisplayed();
    }




}
