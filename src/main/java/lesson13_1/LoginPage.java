package lesson13_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user-name")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(className = "submit-button")
    public WebElement loginButton;

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        if (!"https://www.saucedemo.com/".equals(driver.getCurrentUrl())) {
            throw new IllegalStateException("This is not the login page");
        }
    }

    public LoginPage typeUsername(String username) {
        userName.sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public HomePage submitLogin() {
        loginButton.click();
        return new HomePage(driver);
    }

}
