package lesson13_1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {


    //Домашка 13 с ассертами(пункт 1)
    @Test
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


        WebElement username = (new WebDriverWait(driver, Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='user-name']")));
        driver.findElement(By.xpath("//input[@id='user-name']"));
        //еWebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        driver.findElement(By.xpath("//input[@id='password']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        loginButton.click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement postalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        firstName.sendKeys("Test");
        lastName.sendKeys("Request");
        postalCode.sendKeys("978");
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
        WebElement finishButton = driver.findElement(By.xpath("//button[@id='finish']"));
        finishButton.click();
        WebElement backToProducts = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProducts.click();
        WebElement menuBtn = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        menuBtn.click();
        driver.quit();


    }


}
