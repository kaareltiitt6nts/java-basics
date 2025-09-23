import Utils.MathUtils;
import Utils.StarsUtils;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // w1 e19
        // AgeCheck();

        // w1 e16
        // EvenOrOdd();

        // w1 e34
        // Factorial();

        // w2 e41
        // NumberGuess();

        // w2 e39
        //PrintStars();

        // w3 e50
        // UsernameChars();

        // w3 e60
        AlphabeticalWords();
    }

    public static void AlphabeticalWords() {
        ArrayList<String> words = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word: ");
            String word = input.nextLine();

            if (word.isEmpty()) {
                System.out.println("You entered the following words:");
                Collections.sort(words);

                for (String w : words) {
                    System.out.println(w);
                }

                break;
            }

            words.add(word);
        }
    }

    public static void UsernameChars() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        for (int i = 0; i < Math.min(name.length() - 1, 3); i++) {
            System.out.println(i + 1 + ". character: " + name.charAt(i));
        }
    }

    public static void PrintStars() {
        StarsUtils.PrintSquare(5);
        StarsUtils.PrintRectangle(10, 4);

        StarsUtils.PrintTriangle(5);
    }

    public static void Factorial() {
        int value = 10;

        System.out.println(MathUtils.Factorial(value));
    }

    public static void NumberGuess() {
        Scanner input = new Scanner(System.in);
        int target = MathUtils.RandomInt(1, 100);

        while (true) {
            System.out.println("Pick a number between 1 and 100");
            int guess = input.nextInt();

            if (guess > target) {
                System.out.println("Target is lower.");
            }
            else if (guess < target) {
                System.out.println("Target is higher.");
            }
            else {
                System.out.println("Correct!");
                break;
            }
        }
    }

    public static void AgeCheck() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your age: ");
        float age = Float.parseFloat(reader.nextLine());

        if (age > 0) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
    }

    public static void EvenOrOdd() {
        int first = 5;
        int second = 4;
        float third = 4.42f;
        float fourth = 6f;

        System.out.println("is first even: " + MathUtils.IsEven(first));
        System.out.println("is second even: " + MathUtils.IsEven(second));
        System.out.println("is third even: " + MathUtils.IsEven(third));
        System.out.println("is fourth even: " + MathUtils.IsEven(fourth));
    }
}