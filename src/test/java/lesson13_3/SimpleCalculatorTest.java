package lesson13_3;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@Epic("Simple calculator Test Epic")
@Feature("Verify simple calculator")
public class SimpleCalculatorTest {


    @Test
    @Story("Check simple addition operation")
    @Description("Should check 2 + 2, return 4")
    public void twoPlusTwoEqualsFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    @Story("Check simple addition operation")
    @Description("Should check 4 + 7, return 11")
    public void fourPlusSevenEqualsEleven() {
        SimpleCalculator elevenEq = new SimpleCalculator();
        assertEquals(11, elevenEq.add(4, 7));
    }
}
