package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private final WebDriver driver;

    private static final By firstNameLocator = By.xpath("//input[@id='first-name']");
    private static final By lastNameLocator = By.xpath("//input[@id='last-name']");
    private static final By postalCodeLocator = By.xpath("//input[@id='postal-code']");
    private static final By buttonContinueLocator = By.xpath("//input[@id='continue']");


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        if (!"https://www.saucedemo.com/checkout-step-one.html".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the Checkout page");
        }
    }

    public CheckoutPage writeFirstName(String firstName){
        driver.findElement(firstNameLocator).sendKeys(firstName);
        return this;
    }

    public CheckoutPage writeLastName(String lastName){
        driver.findElement(lastNameLocator).sendKeys(lastName);
        return this;
    }

    public CheckoutPage writePostalCode(int postalCode){
        driver.findElement(postalCodeLocator).sendKeys(String.valueOf(postalCode));
        return this;
    }

    public OverviewPage clickContinue() {
        driver.findElement(buttonContinueLocator).click();
        return new OverviewPage(driver);
    }




}
