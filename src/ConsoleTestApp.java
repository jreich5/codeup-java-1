import yourlastname.util.*;

/**
 * Created by JustinReich on 1/12/17.
 */
public class ConsoleTestApp {
    public static void main(String[] args) {
        Console cn = new Console();
        cn.println(cn.getChoiceString("Please enter 'blue' or 'red", "blue", "red"));
        cn.printInt(cn.getIntWithinRange("Please enter a number between 0 and 100", 0, 100));
    }
}
