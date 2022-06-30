public class Triangle {
    /*public static void main(String [] args) {
        triangle();
    }*/

    public int triangle(int a, int b, int c) {
        int half_perimeter = (a + b + c) / 2;
        int square = (int) Math.sqrt(half_perimeter * (half_perimeter - a) * (half_perimeter - b) * (half_perimeter - c));
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("You can't use negative variable");
        } else {
            return square;
            //   System.out.println("Triangle square: " + square);
        }
    }
}

