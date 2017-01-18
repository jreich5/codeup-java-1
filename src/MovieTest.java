import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JustinReich on 1/17/17.
 */
public class MovieTest {
    public static void main(String[] args) {
        MovieTest mt = new MovieTest();
        mt.runApp();
    }

    public void runApp() {

        MovieIO mi = new MovieIO();
        String message = "\n1) Drama\n2) Sci-Fi\n3) Musical\n4) Animated\n5) Comedy\n6) Horror";
        Scanner sc = new Scanner(System.in);
        MyValidator mv = new MyValidator(sc);
        int numberSelection;
        boolean runLoop = true;

        System.out.println("Welcome to the movie database!");

        mi.setMovieList(); // populate the movie list

        while (runLoop) {
            System.out.println(message);
            System.out.println("");

            numberSelection = mv.getInt("Please select a number to search by category: "); // grab user input

            String categoryResult = mi.selection(numberSelection); // category result

            ArrayList categoryList = mi.returnResults(categoryResult); // retrieve a list of movies from the indicated category

            // print out results
            System.out.println("\n========RESULTS========");
            for (Object result : categoryList) {
                System.out.println(result);
            }
            System.out.println("=======================\n");

            runLoop = mv.yesNo("Select a new category (y/n)? ");
        }

        System.out.println("\nGoodbye!");

    }

    public void programLoop() {

    }
}
