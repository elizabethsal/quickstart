package lesson13_1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MainTest {


    private static final String LOGIN = "standard_user";
    private static final String PASSWORD = "secret_sauce";
    private static final String errorMessage = "Epic sadface: Username and password do not match any user in this service";
    WebDriver driver = WebDriverManager.chromedriver().create();


    @Before
    public void startBrowser() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }


    @Test
    public void checkLoginWithIncorrectData() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeUsername("f4ref")
                .typePassword("href");
        loginPage.loginButton.click();
        List<WebElement> errorMessageContainer = driver.findElements(By.xpath("//h3[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"));
        assertEquals(errorMessage, errorMessageContainer.get(0).getText());
    }

    @Test
    public void checkLogoIsDisplayed() {
        WebElement logo = driver.findElement(By.xpath("//div[@class='bot_column']"));
        assertEquals(true, logo.isDisplayed(), "Logo isn't displayed");
    }

    @Test
    public void checkSuccessfulPurchase() {
        new HomePage(driver).clickItem()
                .clickShoppingCartContainer()
                .clickCheckout()
                .writeFirstName("Gfok")
                .writeLastName("Heck")
                .writePostalCode(5446)
                .clickContinue()
                .clickFinishButton();
        CompletePage completePage = new CompletePage(driver);
        assertEquals("https://www.saucedemo.com/checkout-complete.html", new ChromeDriver().getCurrentUrl());

    }

    @After
    public void close() {
        driver.quit();
    }


}




