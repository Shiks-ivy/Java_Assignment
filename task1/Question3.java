package task1;

//Sannner import
import java.util.Scanner;

public class Question3 {

    // The method below is for testing divisibility by 0
    static void isItDivisibleBy0(int inputNumber) {
        System.out.println(inputNumber + " cannot be divisible by 0.");
    }

    // The method below is for testing divisibility by 1
    static void isItDivisibleBy1(int inputNumber) {
        System.out.println(inputNumber + " is divisible by 1.");
    }

    // The method below is for testing divisibility by 2
    static void isItDivisibleBy2(int inputNumber) {
        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is divisible by 2.");
        } else {
            System.out.println(inputNumber + " is not divisible by 2.");
        }
    }

    // The method below is for testing divisibility by 3
    static void isItDivisibleBy3(int inputNumber) {
        if ((inputNumber % 3) == 0) {
            System.out.println(inputNumber + " is divisible by 3");
        } else {
            System.out.println(inputNumber + " is not divisible by 3");
        }
    }

    // The method below is for testing divisibility by 4
    static void isItDivisibleBy4(int inputNumber) {
        if ((inputNumber % 4) == 0) {
            System.out.println(inputNumber + " is divisible by 4");
        } else {
            System.out.println(inputNumber + " is not divisible by 4");
        }
    }

    // The method below is for testing divisibility by 5
    static void isItDivisibleBy5(int inputNumber) {
        if ((inputNumber % 5) == 0) {
            System.out.println(inputNumber + " is divisible by 5");
        } else {
            System.out.println(inputNumber + " is not divisible by 5");
        }
    }

    // The method below is for testing divisibility by 6
    static void isItDivisibleBy6(int inputNumber) {
        if ((inputNumber % 6) == 0) {
            System.out.println(inputNumber + " is divisible by 6");
        } else {
            System.out.println(inputNumber + " is not divisible by 6");
        }
    }

    // The method below is for testing divisibility by 7
    static void isItDivisibleBy7(int inputNumber) {
        if ((inputNumber % 7) == 0) {
            System.out.println(inputNumber + " is divisible by 7");
        } else {
            System.out.println(inputNumber + " is not divisible by 7");
        }
    }

    // The method below is for testing divisibility by 8
    static void isItDivisibleBy8(int inputNumber) {
        if ((inputNumber % 8) == 0) {
            System.out.println(inputNumber + " is divisible by 8");
        } else {
            System.out.println(inputNumber + " is not divisible by 8");
        }
    }

    // The method below is for testing divisibility by 9
    static void isItDivisibleBy9(int inputNumber) {
        if ((inputNumber % 9) == 0) {
            System.out.println(inputNumber + " is divisible by 9");
        } else {
            System.out.println(inputNumber + " is not divisible by 9");
        }
    }


        // the main method
        public static void main(String[] args) {

            // Scanner object
            Scanner input = new Scanner(System.in);
    
            int numToTest;
            // getting input
            System.out.println("Enter any number to test it's divisibility by 0 - 9:");
            numToTest = input.nextInt();
    
            // calling the methods
            isItDivisibleBy0(numToTest);
            isItDivisibleBy1(numToTest);
            isItDivisibleBy2(numToTest);
            isItDivisibleBy3(numToTest);
            isItDivisibleBy4(numToTest);
            isItDivisibleBy5(numToTest);
            isItDivisibleBy6(numToTest);
            isItDivisibleBy7(numToTest);
            isItDivisibleBy8(numToTest);
            isItDivisibleBy9(numToTest);
        }

    }
