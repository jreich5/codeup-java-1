
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by JustinReich on 12/31/16.
 */


public class OOValidator {

    public Scanner sc;

    public OOValidator(Scanner sc) {
            this.sc = sc;
    }
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


