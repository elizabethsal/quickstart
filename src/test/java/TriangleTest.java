import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.Assert.*;

public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    @DisplayName ("Exception handling")
    public void negativeTriangleTestReturnArgumentException() {
        Triangle triangleSq = new Triangle();
        assertThrows(IllegalArgumentException.class,
                () -> {
            triangleSq.triangleArea(-8, 6,5);
                });
    }
    @Test
    @DisplayName("Positive area verification")
    public void triangleTestReturnRightSquare(){
        Triangle triangleSq1 = new Triangle();
        assertTrue(triangleSq1.triangleArea(8, 15, 16) == 50);
    }

    @Test
    @DisplayName("Negative area verification")
    public void triangleTestReturnWrongSquare(){
        Triangle triangleNegative= new Triangle();
        assertFalse(triangleNegative.triangleArea(9, 8, 9) == 89);
    }

}
