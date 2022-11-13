package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class Triangle {

    static double triangleBase, triangleHeight, area;

    // input the triangleBase and the triangleHeight
    void doInputs() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base of the triangle: ");
        triangleBase = input.nextDouble(); // store the input in triangleBase
        System.out.println("Enter the height of the triangle: ");
        triangleHeight = input.nextDouble(); // store the input in triangleHeight
    }

    // find the area of the rectangle
    void getArea() {
        area = 1/2 * triangleBase * triangleHeight;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area of our triangle is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods
        Triangle objectOfThisClass = new Triangle();
        objectOfThisClass.doInputs();
        objectOfThisClass.getArea();
        objectOfThisClass.outputResults();
    }
}
