import java.util.Scanner;

/**
 * Created by JustinReich on 1/5/17.
 */
public class StudentInfoLookup {
    public static void main(String[] args) {

        String continueProgram = "y";
        int studentQuery;

        System.out.println("Welcome to the Student Database.\n");
        Scanner sc = new Scanner(System.in);

        while (continueProgram.equals("y") || continueProgram.equals("Y")) {

            try {
                System.out.print("Please enter a student ID for info (1 through 5): ");
                studentQuery = sc.nextInt();
                String output = getStudentInfo(studentQuery);
                System.out.println(output);
            } catch (IndexOutOfBoundsException e) {
                sc.nextLine();
                System.out.println("Number entered was out of range.");
            } catch (Exception e) {
                sc.next();
                System.out.println("Invalid input entered. Input must be an integer.");
            }

            System.out.print("Would you like to look up another student (y/n): ");
            continueProgram = sc.next();
        }

    }

    public static String getStudentInfo(int id) {
        String[] studentNames = {"John", "Justin", "Pam", "Ron", "George"};
        int[] studentAges = {25, 31, 29, 18, 28};
        String[] studentDOB = {"March 12", "August 12", "May 4", "April 5", "June 2"};
        String query = "\n" + studentNames[id -1] + " is " + studentAges[id -1] + " and was born on " + studentDOB[id -1] + ".\n";
        return query;

    }

}
