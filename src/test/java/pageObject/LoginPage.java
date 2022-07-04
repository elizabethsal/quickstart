package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final By usernameLocator = By.xpath("//input[@id='user-name']");
    private static final By passwordLocator = By.xpath("//input[@id='password']");
    private static final By loginButtonLocator = By.xpath("//input[@class='submit-button btn_action']");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        if (!"https://www.saucedemo.com/".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the login page");
        }
    }

    public LoginPage typeUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public HomePage submitLogin() {
        driver.findElement(loginButtonLocator).click();
        return new HomePage(driver);
    }

}
