package lesson13_1;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Saucedemo Test Epic")
@Feature("Sigh in and check purchase")
public class MainTest {


    private static final String LOGIN = "standard_user";
    private static final String PASSWORD = "secret_sauce";
    private static final String errorMessage = "Epic sadface: Username and password do not match any user in this service";
    WebDriver driver = WebDriverManager.chromedriver().create();


    @BeforeEach
    public void startBrowser() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }


    @Test
    @Story("Check login with incorrect data")
    @Description("Check login with correct data")
    @Severity(SeverityLevel.NORMAL)
    public void checkLoginWithIncorrectData() {
        LoginPage loginPage = login("f4ref", "ugode");
        loginPage.loginButton.click();
        List<WebElement> errorMessageContainer = driver.findElements(By.xpath("//h3[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"));
        assertEquals(errorMessage, errorMessageContainer.get(0).getText());
    }

    @Test
    @Story("Check logo is displayed")
    @Description("Check logo displayed")
    @Severity(SeverityLevel.TRIVIAL)
    public void checkLogoIsDisplayed() {
        WebElement logo = driver.findElement(By.xpath("//div[@class='bot_column']"));
        assertEquals(true, logo.isDisplayed(), "Logo isn't displayed");
    }

    private LoginPage login(String login, String password) {
        return new LoginPage(driver)
                .typeUsername(login)
                .typePassword(password);
    }

    @Test
    @Story("Check successful purchase")
    @Description("Check successful purchase")
    @Severity(SeverityLevel.NORMAL)
    public void checkSuccessfulPurchase() {
        login(LOGIN, PASSWORD).submitLogin();
        new HomePage(driver).clickItem()
                .clickShoppingCartContainer()
                .clickCheckout()
                .writeFirstName("Gfok")
                .writeLastName("Heck")
                .writePostalCode(5446)
                .clickContinue()
                .clickFinishButton();
        assertEquals("https://www.saucedemo.com/checkout-complete.html", driver.getCurrentUrl());

    }

    @AfterEach
    public void close() {
        driver.quit();
    }


}




