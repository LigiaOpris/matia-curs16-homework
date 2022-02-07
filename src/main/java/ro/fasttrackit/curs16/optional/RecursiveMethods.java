package ro.fasttrackit.curs16.optional;

public class RecursiveMethods {
    public static int sumOfTheFirstNIntegers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumOfTheEvenNumbers(int number) {
        int currentNumber = 2;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + currentNumber;
            currentNumber = currentNumber + 2;
        }
        return sum;
    }

    public static String palindromeStringMethodOne(String word) {
        if (word == null) {
            throw new IllegalArgumentException("You have to enter a word");
        }

        String reverse = palindromeStringMethodOne(word.substring(1)) + word.charAt(0);

        if (word.equals(reverse)) {
            System.out.println("The word " + word + " is palindrome");
        }
        return reverse;
    }

    public static boolean palindromeStringMethodTwo(String word) {
        if (word == null) {
            throw new IllegalArgumentException("You have to enter a word");
        }

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        if (first != last) {
            return false;
        } else {
            return palindromeStringMethodTwo(word.substring(1, word.length() - 1));
        }
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static int fibonacciArray(int number) {
        if (number <= 1) {
            return number;
        }

        int x = 0;
        int y = 1;
        int sum = x + y;

        while (number > 1) {
            sum = x + y;
            x = y;
            y = sum;

            number--;
        }
        return sum;
    }
}