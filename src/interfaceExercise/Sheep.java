package interfaceExercise;

/**
 * Created by JustinReich on 1/20/17.
 */
public class Sheep implements Countable, Cloneable {

    private String name;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Sheep(String name) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
