package lesson13_3;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;


public class SumDoublesValuesTest {


    @Test
    @DisplayName("Verify the not same values")
    public void notSameValuesFunction() {
        SumDoublesValues aSame = new SumDoublesValues();
        SumDoublesValues bSame = new SumDoublesValues();
        assertNotSame("The values are not the same", aSame, bSame);
    }

    @Test
    @DisplayName("Verify that a certain condition is true or false")
    public void trueCondition() {
        assertTrue("a is greater then b", 5 > 4);
    }

    @Test
    @DisplayName("Verify that none of the value is null")
    public void noneNullValues() {
        SumDoublesValues a = new SumDoublesValues();
        SumDoublesValues b = new SumDoublesValues();
        assertNotNull(a);
        assertNotNull(b);
    }

    @Test
    @DisplayName("Verify that the values are equal to each other")
    public void equalsValues() {
        int aEquals = 5;
        int bEquals = 5;
        assertSame(aEquals, bEquals);
    }
}
