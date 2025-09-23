package Utils;

import java.util.Optional;

public class StarsUtils {
    public static void PrintStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }

        System.out.print("\n");
    }

    public static void PrintSquare(int size) {
        PrintRectangle(size, size);
    }

    public static void PrintRectangle(int x, int y) {
        for (int i = 1; i <= y; i++) {
            PrintStars(x);
        }

        System.out.print("\n");
    }

    public static void PrintTriangle(int height) {
        for (int i = 0; i < height; i++) {
            PrintStars(i + 1);
        }

        System.out.print("\n");
    }
}
