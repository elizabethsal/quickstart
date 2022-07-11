package lesson13_3;

import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


@Epic("Simple calculator Test Epic")
@Feature("Verify simple calculator")
public class SimpleCalculatorTest {


    @Test
    @Story("Check simple addition operation")
    @Description("Check 2+2 return right sum")
    @Severity(SeverityLevel.NORMAL)
    public void twoPlusTwoEqualsFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    @Story("Check simple addition operation")
    @Description("Check 4 + 7 return 11")
    @Severity(SeverityLevel.NORMAL)
    public void fourPlusSevenEqualsEleven() {
        SimpleCalculator elevenEq = new SimpleCalculator();
        assertEquals(11, elevenEq.add(4, 7));
    }
}
