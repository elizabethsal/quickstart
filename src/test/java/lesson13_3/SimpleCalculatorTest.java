package lesson13_3;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SimpleCalculatorTest {


    @Test
    @DisplayName("Two plus two equals four")
    public void twoPlusTwoEqualsFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.add(2, 2) == 4);
    }

    @Test
    @DisplayName("Four plus seven equal eleven")
    public void fourPlusSevenEqualsEleven() {
        SimpleCalculator elevenEq = new SimpleCalculator();
        assertEquals(11, elevenEq.add(4, 7));
    }
}
