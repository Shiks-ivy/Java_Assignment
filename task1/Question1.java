package task1;

//Scanner import
import java.util.Scanner;

public class Question1 {

    //program starting point
    public static void main(String[] args) {

        //Scanner object
        Scanner input = new Scanner(System.in);

        String sir_name;
        String numOddEven;
        int age;
        int numLetters;

        //input data
        System.out.println("Enter your surname :");
        sir_name = input.nextLine(); // input the name
        
        System.out.println("Enter your age :");
        age = input.nextInt(); // input the age

        // Finding number of letters in surname
        numLetters = sir_name.length();

        // if age is even or odd... numOddEven
        if (age % 2 == 0) {
            numOddEven = "even";
        } else {
            numOddEven = "odd";
        }

        // Display output
        System.out.println("Your sir name has : " + numLetters + " characters");
        System.out.println("Your current age is an " + numOddEven + " number.");
    }
}