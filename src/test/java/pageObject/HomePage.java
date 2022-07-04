package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final By itemLocator = By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    private static final By shoppingCartLocator = By.xpath("//div[@id='shopping_cart_container']");
    private static final By buttonCheckoutLocator = By.xpath("//button[@id='checkout']");
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        if (!"https://www.saucedemo.com/inventory.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Home page");
        }
    }

    public HomePage clickItem() {
        driver.findElement(itemLocator).click();
        return this;
    }

    public HomePage clickShoppingCartContainer() {
        driver.findElement(shoppingCartLocator).click();
        return this;
    }

    public CheckoutPage clickCheckout() {
        driver.findElement(buttonCheckoutLocator).click();
        return new CheckoutPage(driver);
    }

}
