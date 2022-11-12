package task1;

import java.util.Scanner; //importing Scanner

public class Question2 {

    //this method calculates the avg
    static double findAverage(double unitOne, double unitTwo, double unitThree, double unitFour, double unitFive) {

        // finding the avg
        double avg;
        avg = (unitOne + unitTwo + unitThree + unitFour + unitFive) / 5;

        // rounding the avg
        double mainAverage;
        mainAverage = Math.round(avg * 100.0) / 100.0;

        return mainAverage;
    }

    //main method
    public static void main(String[] args) {

        // my scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for the units of last semester :");

        // getting the marks in each unit
        System.out.println("Unit 1 : ");
        double unit1;
        unit1 = input.nextDouble();
        System.out.println("Unit 2 : ");
        double unit2;
        unit2 = input.nextDouble();
        System.out.println("Unit 3 : ");
        double unit3;
        unit3 = input.nextDouble();
        System.out.println("Unit 4 : ");
        double unit4;
        unit4 = input.nextDouble();
        System.out.println("Unit 5 : ");
        double unit5;
        unit5 = input.nextDouble();

        double average;
        //calling findAverage method
        average = findAverage(unit1, unit2, unit3, unit4, unit5);

        System.out.println("\nYour average mark is : " + average);
    }
}
