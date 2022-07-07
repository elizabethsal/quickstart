package lesson13_3;

public class SumDoublesValues {
    /*
    Given two int values, return their sum. Unless the two
    values are the same, then return double their sum.
     */
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;

        }
        return sum;
    }
}
