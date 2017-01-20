package interfaceExercise;

/**
 * Created by JustinReich on 1/20/17.
 */
public class CountTestApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        Alligator ali = new Alligator("alligator");
        Sheep shp = new Sheep("Blackie");

        System.out.println("Counting Alligators...\n");

        CountUtil.count(ali, 3); // count alligators

        System.out.println("\nCounting Sheep...\n");

        CountUtil.count(shp, 2); // count sheep

        System.out.println("");

        Sheep clone = (Sheep) shp.clone();
        clone.setName("Dolly");
        CountUtil.count(clone, 3); // count clones

        System.out.println("");

        CountUtil.count(shp, 1); // count sheep again
    }
}
