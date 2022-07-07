package lesson13_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement item;
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCart;
    @FindBy(id = "checkout")
    private WebElement buttonCheckout;
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        if (!"https://www.saucedemo.com/inventory.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Home page");
        }
    }

    public HomePage clickItem() {
        item.click();
        return this;
    }

    public HomePage clickShoppingCartContainer() {
        shoppingCart.click();
        return this;
    }

    public CheckoutPage clickCheckout() {
        buttonCheckout.click();
        return new CheckoutPage(driver);
    }

}
