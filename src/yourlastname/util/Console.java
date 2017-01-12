package yourlastname.util;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * A collection of methods to validate user input and print to the console
 *
 * @author Justin Reich
 * @version 1.0
 */
public class Console {
    /**
     * Instantiation of Scanner class to receive user input
     */
    public Scanner sc = new Scanner(System.in);


    // for output
    /**
     *
     * Takes in a string to print to the console
     *
     * @param s a string
     */
    public void print(String s) {
        System.out.print(s);
    }

    /**
     *
     * Takes in a string and prints to a new line on the console
     *
     * @param s a string
     */
    public void println(String s) {
        System.out.println(s);
    }

    /**
     *
     * Takes in an integer and prints to a new line
     *
     * @param number an integer
     */
    public void printInt(int number) {
        System.out.println(number);
    }

    // for input
    /**
     *
     * Takes in a string and validates that it is a string
     *
     * @param prompt a message to the user
     * @return a valid string output
     */
    public String getRequiredString(String prompt) {
        System.out.println(prompt);
        String result;
        try {
            if (sc.hasNext()) {
                result = sc.next();
                return result;
            } else {
                throw new InputMismatchException("Input error.");
            }
        } catch (InputMismatchException e) {
            sc.nextLine(); // clear user input
            System.out.println(e.getMessage());
            return getRequiredString(prompt);
        }
    }

    /**
     *
     * Continues prompting user for one of two possible string choices until a valid choice is made
     *
     * @param prompt the message to the user prompting for one of the two values
     * @param s1 a possible choice
     * @param s2 another possible choice
     * @return the user's choice
     */
    public String getChoiceString(String prompt, String s1, String s2) {
        System.out.println(prompt);
        String result = getRequiredString("Please enter a valid string.");
        try {
            if (result.equals(s1) || result.equals(s2)) {
                return result;
            } else {
                throw new Exception("Choice not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getChoiceString(prompt, s1, s2);
        }
    }

    /**
     *
     * Takes in an integer and validates that it is a valid integer
     *
     * @param prompt a message to the user
     * @return a valid integer
     */
    public int getInt(String prompt) {
        System.out.println(prompt);
        int result;
        try {
            if (sc.hasNextInt()) {
                result = sc.nextInt();
                return result;
            } else {
                throw new InputMismatchException("Input error.");
            }
        } catch (InputMismatchException e) {
            sc.nextLine(); // clear user input
            System.out.println(e.getMessage());
            return getInt(prompt);
        }
    }

    /**
     *
     * Continues prompting user for valid integer input within a given range until a valid selection is made
     *
     * @param prompt the message to the user
     * @param min the minimum value of a valid choice
     * @param max the maximum value of a valid choice
     * @return the the integer value the user enters
     */
    public int getIntWithinRange(String prompt, int min, int max) {
        System.out.println(prompt);
        int result = getInt("Please enter a valid integer");
        try {
            if (result > max) {
                throw new Exception("Number too large.");
            } else if (result < min) {
                throw new Exception("Number too small.");
            } else {
                return result;
            }
        } catch (Exception e) {
            sc.nextLine(); // clear user input
            System.out.println(e.getMessage());
            return getIntWithinRange(prompt, min, max);
        }
    }

    /**
     *
     * Takes in a double and validates that it is a valid double
     *
     * @param prompt a message to the user
     * @return a valid double
     */
    public double getDouble(String prompt) {
        System.out.println(prompt);
        double result;
        try {
            if (sc.hasNextDouble()) {
                result = sc.nextDouble();
                return result;
            } else {
                throw new InputMismatchException("Input error.");
            }
        } catch (InputMismatchException e) {
            sc.nextLine(); // clear user input
            System.out.println(e.getMessage());
            return getInt(prompt);
        }
    }

    /**
     *
     * Continues prompting user for valid double input within a given range until a valid selection is made
     *
     * @param prompt the message to the user
     * @param min the minimum value of a valid choice
     * @param max the maximum value of a valid choice
     * @return the the double value the user enters
     */
    public double getDoubleWithinRange(String prompt, double min, double max) {
        System.out.println(prompt);
        double result = getDouble("Please enter a valid double");
        try {
            if (result > max) {
                throw new Exception("Double too large.");
            } else if (result < min) {
                throw new Exception("Double too small.");
            } else {
                return result;
            }
        } catch (Exception e) {
            sc.nextLine(); // clear user input
            System.out.println(e.getMessage());
            return getDoubleWithinRange(prompt, min, max);
        }
    }
}
