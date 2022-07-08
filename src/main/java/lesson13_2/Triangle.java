package lesson13_2;

public class Triangle {

    public int triangleArea(double a, double b, double c) {

        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("You can't use negative variable");

        }
        //По теореме неравенства треугольника: Каждая сторона треугольника меньше суммы двух других сторон.
        if (a > b + c || b > a + c || c > a + b) {
            throw new IllegalArgumentException("По теореме неравенства треугольника: Каждая сторона треугольника меньше суммы двух других сторон.");
        }
        double halfPerimeter = (a + b + c) / 2;
        return (int) Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));

    }
}

