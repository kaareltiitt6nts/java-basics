package Utils;

public class MathUtils {
    public static boolean IsEven(float value) {
        return value % 2 == 0;
    }

    public static int RandomInt(int min, int max) {
        return (int)Math.round(min + (max - min) * Math.random());
    }

    public static int Factorial(int value) {
        int current = 1;

        for (int i = 1; i <= value; i++) {
            current *= i;
        }

        return current;
    }
}
