package ro.fasttrackit.curs16.myHomework.ex1;

public class Main {
    public static void main(String[] args) {
        RecursiveMethods firstSum = new RecursiveMethods();
        RecursiveMethods secondSum = new RecursiveMethods();
        RecursiveMethods palindromeWordMethodOne = new RecursiveMethods();
        RecursiveMethods palindromeWordMethodTwo = new RecursiveMethods();
        RecursiveMethods sumOfDigits = new RecursiveMethods();
        RecursiveMethods fibonacciArray = new RecursiveMethods();

        System.out.println(firstSum.sumOfTheFirstNIntegers(10));
        System.out.println(secondSum.sumOfTheEvenNumbers(20));
        System.out.println(palindromeWordMethodOne.palindromeStringMethodOne("madam"));
        System.out.println("The given word is palindrome? Let's check if it is");

        if (palindromeWordMethodTwo.palindromeStringMethodTwo("ana") == true) {
            System.out.println("So, the given word is palindrome");
        } else {
            System.out.println("So, the given word isn't palindrome");
        }

        System.out.println("The sum of this number's digits is: " + sumOfDigits.sumOfDigits(123456789));
        System.out.println("The sum of fibonacci's array is: " + fibonacciArray.fibonacciArray(10));
    }
}
