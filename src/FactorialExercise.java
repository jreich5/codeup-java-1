import java.util.Scanner;
/**
 * Created by JustinReich on 1/5/17.
 */
public class FactorialExercise {
    public static void main(String[] args) {
        // Factorial exercise

        String continueProgram = "y";

        while (continueProgram.equals("y") || continueProgram.equals("Y")) {

            int userInput;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to from 1 to 20: ");
            userInput = sc.nextInt();

            if (userInput > 0 && userInput < 21) {
                System.out.println(calculateFactorial(userInput));
            } else {
                System.out.println("Input out of range");
            }

            System.out.print("Do you wish to enter another number (y/n)? ");
            continueProgram = sc.next();

        }
    }

    public static long calculateFactorial(int o1) {
        long result = 1;
        for (int i = 1; i <= o1 ; i++) {
            result *= i;
        }
        return result;
    }

    /*
    // Recursive Solution
    public static long calculateFactorial(int o1) {
        long result = 1;
        if (o1 == 1) {
            return result;
        } else {
            return o1 * calculateFactorial(o1 -1);
        }
    }
    */
}
