public class Triangle {
    /*public static void main(String [] args) {
        triangle();
    }*/

    public int triangleArea(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("You can't use negative variable");

        }
        int halfPerimeter = (a + b + c) / 2;
        return (int) Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
