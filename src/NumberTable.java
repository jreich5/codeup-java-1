import java.util.*;

/**
 * Created by JustinReich on 1/5/17.
 */
public class NumberTable {
    public static void main(String[] args) {
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
    }
}
