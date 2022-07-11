package lesson13_3;


import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

@Epic("Sum double values Test Epic")
@Feature("Verify double values")
public class SumDoublesValuesTest {


    @Test
    @Story("Check not same values")
    @Description("Check that values are not the same")
    @Severity(SeverityLevel.NORMAL)
    public void notSameValuesFunction() {
        SumDoublesValues aSame = new SumDoublesValues();
        SumDoublesValues bSame = new SumDoublesValues();
        assertNotSame("The values are not the same", aSame, bSame);
    }

    @Test
    @Story("Check true condition")
    @Description("Check that value a greater than b")
    @Severity(SeverityLevel.NORMAL)
    public void trueCondition() {
        assertTrue("a is greater then b", 5 > 4);
    }

    @Test
    @Story("Check not null")
    @Description("Check that values not null")
    @Severity(SeverityLevel.NORMAL)
    public void noneNullValues() {
        SumDoublesValues a = new SumDoublesValues();
        SumDoublesValues b = new SumDoublesValues();
        assertNotNull(a);
        assertNotNull(b);
    }

    @Test
    @Story("Check true condition")
    @Description("Check that value a is equal b")
    @Severity(SeverityLevel.NORMAL)
    public void equalsValues() {
        int aEquals = 5;
        int bEquals = 5;
        assertSame(aEquals, bEquals);
    }
}
