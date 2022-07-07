package lesson13_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {


    private final WebDriver driver;
    @FindBy(id = "back-to-products")
    private WebElement buttonBackToProducts;

    public CompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        if (!"https://www.saucedemo.com/checkout-complete.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Complete page");
        }
    }

    public HomePage clickBackToProductsButton() {
        buttonBackToProducts.click();
        return new HomePage(driver);
    }


}
