import java.util.Scanner;

/**
 * Created by JustinReich on 1/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        CircleApp cp = new CircleApp();
        cp.runApp();
    }
    public void runApp() {
        boolean runLoop = true;
        while (runLoop) {
            Scanner sc = new Scanner(System.in);
            MyValidator mv = new MyValidator(sc);
            double radius = mv.getDouble("\nPlease enter a radius length: ");
            Circle cir = new Circle(radius);
            System.out.println("\nArea: " + cir.getFormattedArea());
            System.out.println("Circumference: " + cir.getFormattedCircumference());
            runLoop = mv.yesNo("\nEnter another value (y/n)? ");
        }
        System.out.println("Goodbye!");
    }
}
