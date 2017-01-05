import java.util.*;

/**
 * Created by JustinReich on 1/5/17.
 */
public class IOLesson {

    public static void main(String[] args) {
        // 5.2 - Console I / O

        int userInput;
        String userInputString;
        String userInput1;
        String userInput2;
        String userInput3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        userInput = sc.nextInt();
        System.out.println("You entered: " + userInput);

        // Clear out input
        sc.nextLine();

        System.out.println("Please enter a sentence: ");
        userInputString = sc.nextLine();
        System.out.println("You entered: " + userInputString);

        System.out.println("Please enter a word: ");
        userInput1 = sc.next();

        System.out.println("Please enter a second word: ");
        userInput2 = sc.next();

        System.out.println("Please enter a third word: ");
        userInput3 = sc.next();

        System.out.println("You entered: " + userInput1 + " and " + userInput2 + " and " + userInput3);

        System.out.println("\nWelcome to the geometric calculator!");
        System.out.println("I can calculate the parameter, area, and volume of a room.");
        System.out.println("All input and output will be calculated using feet.");

        double length;
        double width;
        double height;
        String response = "yes";

        while (Objects.equals(response, "yes") || Objects.equals(response, "y") || Objects.equals(response, "Y")) {

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
