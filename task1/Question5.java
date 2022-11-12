package task1;

import java.util.Scanner; //importing Scanner

public class Question5 {

    // This method is to perform the calculations
    static void operations(double num1, double num2, char operator) {

        Double result;

        switch (operator) {
            // addition
            case '+':
                result = num1 + num2;
                System.out.println("The result is : " + result);
                break;

            // subtraction
            case '-':
                result = num1 - num2;
                System.out.println("The result is : " + result);
                break;

            // multiplication
            case '*':
                result = num1 * num2;
                System.out.println("The result is : " + result);
                break;

            // division
            case '/':
                result = num1 / num2;
                System.out.println("The result is : " + result);
                break;

            default:
                System.out.println("There was an error in your input. Please try again");
                break;
        }
    }

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner object

        //get first number
        System.out.println("Enter the first number");
        Double num1;
        num1 = input.nextDouble(); // input first number

        // get the operator 
        System.out.println("Enter one operator (such as: +, -, * or /): ");
        char operator;
        operator = input.next().charAt(0); // input the operator

        // get second number 
        System.out.println("Enter second number");
        Double num2;
        num2 = input.nextDouble(); // input second number

        operations(num1, num2, operator);
    }
}