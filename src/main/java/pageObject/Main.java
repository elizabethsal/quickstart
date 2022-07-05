package pageObject;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;




public class Main {

    private static final String LOGIN = "standard_user";
    private static final String PASSWORD = "secret_sauce";


    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
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

