package Question3.leapyear;

import java.util.Scanner;

public class LeapYear {

    // the method to find leap year
    static void isItLeapYear() {

        // variable to store year
        int year;
        // scanner object
        Scanner input = new Scanner(System.in);

        // input year
        System.out.println("Enter year :");
        year = input.nextInt();

        
        //check year if it is leap or not
        if ((year % 4) == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

        // the main method
        public static void main(String[] args) {
            isItLeapYear(); //call the method
        }
}
