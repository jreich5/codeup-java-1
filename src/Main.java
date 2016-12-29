import java.util.Arrays;
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
        /*

        int userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        userInput = sc.nextInt();

        System.out.println("You entered: " + userInput);

        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a sentence: ");
        userInput = sc.next();

        System.out.println("You entered: " + userInput);

        String userInput1;
        String userInput2;
        String userInput3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        userInput1 = sc.next();

        System.out.print("Please enter a second word: ");
        userInput2 = sc.next();

        System.out.print("Please enter a third word: ");
        userInput3 = sc.next();

        System.out.println("You entered: " + userInput1 + " and " + userInput2 + " and finally " + userInput3);

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
        */

        // 5.3 - Control Statements

        /*
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }


        int i = 100;
        while (i >= 0 ) {
            System.out.println(i);
            i -= 5;
        }


        int i = 2;

        do {
            System.out.println(i);
            i *= i;
        } while(i < 1000000 && i != 0);


        for (int i = 100; i >= 0; i -=5) {
            System.out.println(i);
        }

        for (int i = 2; i < 1000000 && i != 0; i *= i) {
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
             if (i % 5 == 0 && i % 3 == 0) {
                 System.out.println("FizzBuzz");
             } else if (i % 3 == 0) {
                 System.out.println("Fizz");
             } else if (i % 5 == 0) {
                 System.out.println("Buzz");
             } else {
                 System.out.println(i);
             }
         }



        int userInput;
        String continueGame = "yes";


        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number:");
            userInput = sc.nextInt();

            for (int i = 1; i <= userInput; i++) {
                System.out.print("\n" + i + " to the power of 2 is " + (i * i));
                System.out.print(" || " + i + " to the power of 3 is " + (i * i * i));
            }

            System.out.println("\n\nWould you like to enter another number?");
            continueGame = sc.next();

        } while (Objects.equals(continueGame, "yes"));



        int userInput;
        String continueGame = "yes";


        do {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number grade:");
            userInput = sc.nextInt();

            if (userInput <= 60) {
                System.out.println("The letter grade is F");
            } else if (userInput <= 66) {
                System.out.println("The letter grade is D");
            } else if (userInput <= 79) {
                System.out.println("The letter grade is C");
            } else if (userInput <= 87) {
                System.out.println("The letter grade is B");
            } else {
                System.out.println("The letter grade is A");
            }

            System.out.println("\nWould you like to enter another number grade?");
            continueGame = sc.next();

        } while (Objects.equals(continueGame, "yes"));
        */

        // 5.4 - Strings

        /*
        String message = "We don't need no education\n\nWe don't need no thought control";
        System.out.println(message);
        */


        /*
        String message = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(message);
        */


        /*
        String message = "In windows, the main drive is usually C:\\";
        System.out.println(message);
        */

        /*
        String message = "I can do back slashes \\, and double back slashes \\\\, and the amzing triple back-slash \\\\\\";
        System.out.println(message);
        */

        // Pig Latin Program



    }
}
