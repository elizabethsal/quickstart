package lesson13_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {

    private final WebDriver driver;
    @FindBy(id = "finish")
    private WebElement buttonFinish;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        if (!"https://www.saucedemo.com/checkout-step-two.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Overview page");
        }
    }

    public CompletePage clickFinishButton() {
        buttonFinish.click();
        return new CompletePage(driver);
    }
}
