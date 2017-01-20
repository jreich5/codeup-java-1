package interfaceExercise;

/**
 * Created by JustinReich on 1/20/17.
 */
public class Alligator implements Countable {

    private int count = 0;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Alligator(String name) {
        this.name = name;
    }

    public void incrementCount() {
        count++;
    }

    public void resetCount() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public String getCountString() {
        return Integer.toString(count);
    }

    public String formattedCount() {
        return getCountString() + " " + name;
    }

}
