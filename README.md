## Main Classes

### Test Classes

- **LogoutTest**: Tests the logout functionality. Verifies that the login logo is present after logging out.
  
- **PurchaseTest**: Performs a random purchase of products. Verifies that the confirmation message of the purchase is as expected.

- **RemoveCartItemsTest**: Tests the functionality of removing items from the cart. Verifies that the number of items in the cart is zero after removal.

### Page Classes

- **BasePage**: Base class for all pages, handling element initialization and providing common methods such as `waitElementVisibility`.

- **LoginPage**: Manages the login logic, including entering credentials and verifying the presence of the login logo.

- **InventoryPage**: Contains methods to interact with available products, such as making random purchases and navigating to the shopping cart.

- **ShoppingCartPage**: Manages the logic of the shopping cart, including removing items and the checkout process.

- **CheckoutStep1Page**: Handles the entry of customer information during the checkout process.

- **CheckoutStep2Page**: Completes the purchase and navigates to the confirmation page.

- **CompletedCheckoutPage**: Verifies the purchase confirmation message.

- **MenuBar**: Manages the logic of the menu, including logging out.

## Requirements

- Java 8 or higher
- Selenium WebDriver
- TestNG
- A compatible browser (Chrome, Firefox, etc.)
- ChromeDriver or the corresponding driver for the browser you are using

## Setup

1. Clone the repository to your local machine.
2. Ensure you have Java and Maven installed.
3. Open the project in your favorite IDE (e.g., IntelliJ IDEA or Eclipse).
4. Configure the `testng.xml` file with the credentials and the URL of the application you want to test.

## Running Tests

To run the tests, you can use the following command in the terminal:

```bash
mvn test
