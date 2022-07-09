package lesson13_3;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@Epic("Sum double values Test Epic")
@Feature("Verify double values")
public class SumDoublesValuesTest {


    @Test
    @Story("Check not same values")
    @Description("Should assert that values are not the same")
    public void notSameValuesFunction() {
        SumDoublesValues aSame = new SumDoublesValues();
        SumDoublesValues bSame = new SumDoublesValues();
        assertNotSame("The values are not the same", aSame, bSame);
    }

    @Test
    @Story("Check true condition")
    @Description("Check that value a greater than b")
    public void trueCondition() {
        assertTrue("a is greater then b", 5 > 4);
    }

    @Test
    @Story("Check not null")
    @Description("Check that values not null")
    public void noneNullValues() {
        SumDoublesValues a = new SumDoublesValues();
        SumDoublesValues b = new SumDoublesValues();
        assertNotNull(a);
        assertNotNull(b);
    }

    @Test
    @Story("Check true condition")
    @Description("Check that value a is equal b")
    public void equalsValues() {
        int aEquals = 5;
        int bEquals = 5;
        assertSame(aEquals, bEquals);
    }
}
