import java.util.Scanner;

/**
 * Created by JustinReich on 12/31/16.
 */


public class ValidatorTestApp {
    public static void runTests() {

        int maxInt = 10;
        int minInt = -10;
        double maxDouble = 10.0;
        double minDouble = -10.0;
        String intTestPrompt = "Please enter the integer: ";
        String intTestRangePrompt = "Please enter an integer between " + minInt + " and " + maxInt;
        String doubleTestPrompt = "Please enter a valid double: ";
        String doubleRangeTestPrompt = "Please enter an integer between " + minDouble + " and " + maxDouble;
        String stringTestPrompt = "Please enter a word: ";
        String string1 = "cat";
        String string2 = "dog";
        String stringChoiceTest = "Please enter either " + string1 + " or " + string2 + ": ";

        Scanner sc = new Scanner(System.in);
        OOValidator oo = new OOValidator(sc);
        MyValidator myV = new MyValidator(sc);

        System.out.println("Welcome to the Validation Tester Application");

        System.out.println("");

        System.out.println("Int Test");
        System.out.println(oo.getInt(intTestPrompt));
        System.out.println("");

        System.out.println("Int Range Test");
        System.out.println(oo.getIntWithinRange(intTestRangePrompt, minInt, maxInt));
        System.out.println("");

        System.out.println("Double Test");
        System.out.println(oo.getDouble(doubleTestPrompt));
        System.out.println("");

        System.out.println("Double Range Test");
        System.out.println(oo.getDoubleWithinRange(doubleRangeTestPrompt, minDouble, maxDouble));
        System.out.println("");

        System.out.println("String Test");
        System.out.println(myV.getRequiredString(stringTestPrompt));
        System.out.println("");

        System.out.println("String Choice Test");
        System.out.println(myV.getChoiceString(stringChoiceTest, string1, string2));

    }
}

