package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {

    private final WebDriver driver;
    private static final By buttonFinishLocator = By.xpath("//button[@id='finish']");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        if (!"https://www.saucedemo.com/checkout-step-two.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Overview page");
        }
    }
    public CompletePage clickFinishButton() {
        driver.findElement(buttonFinishLocator).click();
        return new CompletePage(driver);
    }
}
