package lesson13_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    private final WebDriver driver;

    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(id = "continue")
    private WebElement buttonContinue;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        if (!"https://www.saucedemo.com/checkout-step-one.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Checkout page");
        }
    }

    public CheckoutPage writeFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public CheckoutPage writeLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public CheckoutPage writePostalCode(int postalCode) {
        this.postalCode.sendKeys(String.valueOf(postalCode));
        return this;
    }

    public OverviewPage clickContinue() {
        buttonContinue.click();
        return new OverviewPage(driver);
    }


}
