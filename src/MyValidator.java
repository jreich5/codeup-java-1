import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by JustinReich on 12/31/16.
 */

public class MyValidator extends OOValidator {
    public MyValidator(Scanner sc) {
        super(sc);
    }

    public String getRequiredString(String prompt) {
        System.out.print(prompt);
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

    public String getRequiredStringLine(String prompt) {
        System.out.print(prompt);
        String result;
        try {
            if (sc.hasNext()) {
                result = sc.nextLine();
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

    public String getChoiceString(String prompt, String s1, String s2) {
        String result = getRequiredString(prompt);

        try {
            if (result.equalsIgnoreCase(s1) || result.equalsIgnoreCase(s2)) {
                return result;
            } else {
                throw new Exception("Choice not valid");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getChoiceString(prompt, s1, s2);
        }
    }

    public boolean yesNo(String prompt) {
        sc.nextLine();
        String result = getChoiceString(prompt, "y", "n");
        if (result.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

}



