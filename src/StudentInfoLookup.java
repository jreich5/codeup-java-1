import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by JustinReich on 1/5/17.
 */
public class StudentInfoLookup {

    private static int[] studentAges = {25, 31, 29, 18, 28};
    private static String[] studentNames = {"John", "Justin", "Pam", "Ron", "George"};
    private static String[] studentDOB = {"March 12", "August 12", "May 4", "April 5", "June 2"};

    public static void queryInput(Scanner sc) throws OneIsBadException {
        String continueProgram = "y";
        int studentQuery;

        System.out.println("Welcome to the Student Database.\n");

        while (continueProgram.equals("y") || continueProgram.equals("Y")) {

            System.out.print("Please enter a student ID for info (1 through 5): ");
            String output;

            try {
                studentQuery = sc.nextInt();
                if (studentQuery == 1) {
                    throw new OneIsBadException("Don't pick 1!!");
                }
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Invalid input entered. Input must be an integer.");
                continue;
            }
            try {
                output = getStudentInfo(studentQuery);
            } catch (IndexOutOfBoundsException e) {
                sc.nextLine();
                System.out.println("Number entered was out of range.");
                continue;
            }
            System.out.println(output);

            System.out.print("Would you like to look up another student (y/n): ");
            continueProgram = sc.next();

        }
    }

    public static String getStudentInfo(int id) {

        String query = "\n" + studentNames[id -1] + " is " + studentAges[id -1] + " and was born on " + studentDOB[id -1] + ".\n";
        return query;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            queryInput(sc);
        } catch (Exception e) {
            System.out.println("The following was thrown: " + e);
        }

    }

}
