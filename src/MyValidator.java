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

}



