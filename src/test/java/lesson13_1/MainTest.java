package lesson13_1;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
    @Description("Should assert the login is correct, if no, return error message")
    public void checkLoginWithIncorrectData() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUsername("f4ref")
                .typePassword("href");
        loginPage.loginButton.click();
        List<WebElement> errorMessageContainer = driver.findElements(By.xpath("//h3[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"));
        assertEquals(errorMessage, errorMessageContainer.get(0).getText());
    }

    @Test
    @Story("Check logo is displayed")
    @Description("Should assert logo is displayed")
    public void checkLogoIsDisplayed() {
        WebElement logo = driver.findElement(By.xpath("//div[@class='bot_column']"));
        assertEquals(true, logo.isDisplayed(), "Logo isn't displayed");
    }

    @Test
    @Story("Check successful purchase")
    @Description("Should assert purchase is successful")
    public void checkSuccessfulPurchase() {
        new HomePage(driver).clickItem()
                .clickShoppingCartContainer()
                .clickCheckout()
                .writeFirstName("Gfok")
                .writeLastName("Heck")
                .writePostalCode(5446)
                .clickContinue()
                .clickFinishButton();
        new CompletePage(driver);
        assertEquals("https://www.saucedemo.com/checkout-complete.html", new ChromeDriver().getCurrentUrl());

    }

    @AfterEach
    public void close() {
        driver.quit();
    }


}




