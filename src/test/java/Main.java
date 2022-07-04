import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.LoginPage;

public class Main {

    private static final String LOGIN = "standard_user";
    private static final String PASSWORD = "secret_sauce";


    @Test
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        new LoginPage(driver)
                .typeUsername(LOGIN)
                .typePassword(PASSWORD)
                .submitLogin()
                .clickItem()
                .clickShoppingCartContainer()
                .clickCheckout()
                .writeFirstName("Gfok")
                .writeLastName("Heck")
                .writePostalCode(5446)
                .clickContinue()
                .clickFinishButton()
                .clickBackToProductsButton();
        driver.quit();
    }
}

