package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class GetAreaOfTriangle {

    // these variables are available in this class, and shared with all methods here
    static double base, height, area;

    // input the base and the height
    void doInputs() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs


        System.out.println("Enter the base of the triangle : ");
        base = input.nextDouble(); // store the input in base


        System.out.println("Enter the height of the triangle : ");
        height = input.nextDouble(); // store the input in height
    }

    // get the area of the rectangle
    void findArea() {

        // area of triangle = 1/2 * base * height

        area = 1 / 2 * base * height;
    }

    // method to output area
    void getResults() {
        System.out.println("The area is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods in the main method
        GetAreaOfTriangle myClassObj = new GetAreaOfTriangle();
        myClassObj.doInputs();
        myClassObj.findArea();
        myClassObj.getResults();
    }

}
