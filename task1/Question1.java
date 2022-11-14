package task1;

//Scanner import
import java.util.Scanner;

public class Question1 {

    // main method
    public static void main(String[] args) {

        // my Scanner object
        Scanner input = new Scanner(System.in);

        // My variables
        String userSurname, typeOfNumber;
        int age, numOfLetters;

        System.out.println("Enter your userSurname :");
        userSurname = input.nextLine(); // input name

        System.out.println("Enter your age :");
        age = input.nextInt(); // input age

        // get number of characters in userSurname
        numOfLetters = userSurname.length();
        //Check if even or odd
        if (age % 2 == 0) {
            // age is even
            typeOfNumber = "even";
        } else {
            // age is odd
            typeOfNumber = "odd";
        }
        //output
        System.out.println("Your userSurname has : " + numOfLetters + " characters");
        System.out.println("Your age is an " + typeOfNumber + " number.");
    }
}