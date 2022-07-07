package lesson13_1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {


    private static final String LOGIN = "standard_user";
    private static final String PASSWORD = "secret_sauce";
    private static final String errorMessage = "Epic sadface: Username and password do not match any user in this service";
    WebDriver driver = WebDriverManager.chromedriver().create();


    @Test
    public void test() {


        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        WebElement logo = driver.findElement(By.xpath("//div[@class='bot_column']"));
        assertEquals(true, logo.isDisplayed());
        System.out.println("Logo is displayed");
        loginPage.typeUsername("ferf")
                .typePassword("refwr");
        loginPage.loginButton.click();
        List<WebElement> errorMessageContainer = driver.findElements(By.xpath("//h3[contains(text(), 'Epic sadface: Username and password do not match any user in this service')]"));
        if (errorMessageContainer.size() != 0) {
            assertEquals(errorMessage, errorMessageContainer.get(0).getText());
        } else {
            new HomePage(driver).clickItem()
                    .clickShoppingCartContainer()
                    .clickCheckout()
                    .writeFirstName("Gfok")
                    .writeLastName("Heck")
                    .writePostalCode(5446)
                    .clickContinue()
                    .clickFinishButton()
                    .clickBackToProductsButton();

        }
        driver.quit();


    }


}

