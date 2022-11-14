package task1;

import java.util.Scanner; //importing Scanner

public class Question5 {
    public static void main(String[] args) {

        // my variables
        Double num1, num2, result;
        char myOperator;

        Scanner input = new Scanner(System.in); // Scanner object

        // input first number
        System.out.println("Enter the first number");
        num1 = input.nextDouble();

        // input operator

        System.out.println("Type one of these (+, -, *, or /)signs as your operator : ");
        myOperator = input.next().charAt(0);

        // input second number
        System.out.println("Enter second number");
        num2 = input.nextDouble();

        if (myOperator == '-') {
            result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
        }
        if (myOperator == '+') {
            result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
        }
        if (myOperator == '*') {
            result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
        }
        if (myOperator == '/') {
            result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
        }
    }
}