import java.util.Objects;
import java.util.Scanner;

/**
 * Created by JustinReich on 1/5/17.
 */
public class GradeConverter {
    public static void main(String[] args) {

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
    }
}
