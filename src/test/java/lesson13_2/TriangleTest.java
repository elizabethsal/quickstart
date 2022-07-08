package lesson13_2;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {


    @Test
    @DisplayName("Negative area verification")
    @Step("First")
    public void triangleTestReturnWrongSquare() {
        Triangle triangleNegative = new Triangle();
        Assertions.assertNotEquals(89, triangleNegative.triangleArea(9, 8, 9));
    }

    @Test
    @DisplayName("Verify that each side of the triangle is greater than the other sums of the sides")
    @Step("Second")
    public void eachSideGreaterTheSumSides() {
        Triangle triangleArea = new Triangle();
        assertThrows(IllegalArgumentException.class,
                () -> triangleArea.triangleArea(15, 8, 3));
    }

    @Test
    @DisplayName("Exception handling")
    @Step("Third")
    public void negativeTriangleTestReturnArgumentException() {
        Triangle triangleSq = new Triangle();
        assertThrows(IllegalArgumentException.class,
                () -> triangleSq.triangleArea(-8, 6, 5));
    }

    @Test
    @DisplayName("Positive area verification")
    @Step("Fourth")
    public void triangleTestReturnRightSquare() {
        Triangle triangleSq1 = new Triangle();
        Assertions.assertEquals(50, triangleSq1.triangleArea(8, 15, 16));
    }
}
