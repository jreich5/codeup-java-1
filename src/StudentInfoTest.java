import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Runs and tests a student info storage application
 *
 * <p>This application takes user entered student information from the console and the information is stored and sorted for each student and printed in the console.</p>
 *
 * @author Justin Reich
 * @version 1.0
 */
public class StudentInfoTest {

    /**
     * Runs the application by creating local variables to store user data and instantiate StudentInfo objects for each student.
     */
    public void runApp() {

        //*******VARIABLES*******//

        // Scanner object to pass to validator constructor
        Scanner sc = new Scanner(System.in);

        // Validation object to validate user inputs
        MyValidator mv = new MyValidator(sc);

        // Variables to store values to validate user inputs and pass to the StudentInfo constructor
        String firstNameToStore;
        String lastNameToStore;
        int scoreToStore;

        // Boolean to run while loop
        boolean loopResult = true;

        // Store StudentInfo objects
        ArrayList<StudentInfo> sList = new ArrayList<>();


        //*******PROCEDURE*******//

        System.out.println("Welcome to the student info storage application.");

        // Continue prompting user for new student entries until program is ended
        while (loopResult) {
            // Validate variables
            firstNameToStore = mv.getRequiredString("\nPlease enter the student's first name: ");
            lastNameToStore = mv.getRequiredString("Please enter " + firstNameToStore + "'s last name: ");
            scoreToStore = mv.getIntWithinRange("Please enter " + firstNameToStore + " " + lastNameToStore + "'s score between 0 and 100: ", 0, 100);
            StudentInfo s = new StudentInfo(firstNameToStore, lastNameToStore, scoreToStore); //Create the StudentInfo object with validated variables passed to constructor
            sList.add(s); //Append to ArrayList
            loopResult = mv.yesNo("\nWould you like to enter another student? (y/n): "); //Prompt user for another entry
        }

        System.out.println("\nTotal Student Results...");
        Collections.sort(sList); // Sort list based on student last name
        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i).studentInfoMessage());
        }
    }

    /**
     * The main method to test the application
     * @param args
     */
    public static void main(String[] args) {

        StudentInfoTest sIT = new StudentInfoTest();
        sIT.runApp();

    }
}
