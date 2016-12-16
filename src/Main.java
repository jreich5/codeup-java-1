import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // INTRO
        //System.out.println("Hello World!");


        // 5.1 - Syntax and Types
        /*
        byte byteNumber = 2;
        System.out.println(byteNumber);

        short shortNumber = 300;
        System.out.println(shortNumber);

        int intNumber = 50000;
        System.out.println(intNumber);

        long longNumber = 43912347821347529L;
        System.out.printf("%,d\n",longNumber);

        float floatNumber = (float) 4.39;
        System.out.println(floatNumber);

        double doubleNumber = 4.1289252858987273894783928738491;
        System.out.println(doubleNumber);

        char charThing = 'j';
        System.out.println(charThing);

        intNumber = 'h';
        System.out.println(intNumber);

        //int class = 34;

        //int nullNumber;
        //System.out.println(nullNumber);
        */


        // 5.2 - Console I / O

//        int userInput;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        userInput = sc.nextInt();
//
//        System.out.println("You entered: " + userInput);

//        String userInput;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Please enter a sentence: ");
//        userInput = sc.next();
//
//        System.out.println("You entered: " + userInput);

//        String userInput1;
//        String userInput2;
//        String userInput3;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Please enter a word: ");
//        userInput1 = sc.next();
//
//        System.out.print("Please enter a second word: ");
//        userInput2 = sc.next();
//
//        System.out.print("Please enter a third word: ");
//        userInput3 = sc.next();
//
//        System.out.println("You entered: " + userInput1 + " and " + userInput2 + " and finally " + userInput3);

        System.out.println("\nWelcome to the geometric calculator!");
        System.out.println("I can calculate the parameter, area, and volume of a room.");
        System.out.println("All input and output will be calculated using feet.");

        double length;
        double width;
        double height;
        String response = "yes";

        while (Objects.equals(response, "yes") || Objects.equals(response, "y") || Objects.equals(response, "Y")) {

            Scanner sc = new Scanner(System.in);

            System.out.print("\nPlease enter the room length: ");
            length = sc.nextDouble();

            System.out.print("Please enter the room width: ");
            width = sc.nextDouble();

            System.out.print("Please enter the room height: ");
            height = sc.nextDouble();

            System.out.println("The parameter of the room is: " + ((length * 2) + (width * 2)) + " feet.");
            System.out.println("The area of the room is: " + width * length + " feet.");
            System.out.println("The volume of the room is: " + width * length * height + " cubic feet.");

            System.out.print("Would you like to calculate another room (please enter 'yes' or 'no')? ");
            response = sc.next();

        }

    }
}
