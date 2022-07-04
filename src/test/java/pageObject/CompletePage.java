package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage {


    private final WebDriver driver;
    private static final By buttonBackToProductsLocator = By.xpath("//button[@id='back-to-products']");

    public CompletePage(WebDriver driver) {
        this.driver = driver;
        if (!"https://www.saucedemo.com/checkout-complete.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Complete page");
        }
    }

    public HomePage clickBackToProductsButton() {
        driver.findElement(buttonBackToProductsLocator).click();
        return new HomePage(driver);
    }


}
