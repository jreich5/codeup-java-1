package interfaceExercise;

import interfaceExercise.Countable;

/**
 * Created by JustinReich on 1/20/17.
 */
public class CountUtil {
    public static void count(Countable c, int maxCount) {

        for (int i = 0; i < maxCount; i++) {
            c.incrementCount();
            System.out.println(c.formattedCount());
        }

        c.resetCount();

    }
}
