package lesson13_2;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Epic("Triangle Test Epic")
@Feature("Triangle field by side lengths")
public class TriangleTest {


    @Test
    @Story("Trying to return wrong square")
    @Description("should assert non-equals")
    public void triangleTestReturnWrongSquare() {
        Triangle triangleNegative = new Triangle();
        Assertions.assertNotEquals(89, triangleNegative.triangleArea(9, 8, 9));
    }

    @Test
    @Story("eachSideGreaterTheSumSides")
    @Description("should throw IllegalArgumentException")
    public void eachSideGreaterTheSumSides() {
        Triangle triangleArea = new Triangle();
        assertThrows(IllegalArgumentException.class,
                () -> triangleArea.triangleArea(15, 8, 3));
    }

    @Test
    @Story("negativeTriangleTestReturnArgumentException")
    @Description("should throw IllegalArgumentException")
    public void negativeTriangleTestReturnArgumentException() {
        Triangle triangleSq = new Triangle();
        assertThrows(IllegalArgumentException.class,
                () -> triangleSq.triangleArea(-8, 6, 5));
    }

    @Test
    @Story("This is a Fail Story.")
    @Description("This is a Fail Story Description.")
    public void failTest() {
        assertTrue(false);
    }

    @Test
    @Story("triangleTestReturnRightSquare")
    @Description("should assert equal field int value")
    public void triangleTestReturnRightSquare() {
        Triangle triangleSq1 = new Triangle();
        Assertions.assertEquals(59, triangleSq1.triangleArea(8, 15, 16));
    }
}
