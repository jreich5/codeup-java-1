/**
 * Created by JustinReich on 1/5/17.
 */
public class ControlStatements {
    public static void main(String[] args) {
        // 5.3 - Control Statements


        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println("");

        i = 100;
        while (i >= 0 ) {
            System.out.println(i);
            i -= 5;
        }

        System.out.println("");

        i = 2;

        do {
            System.out.println(i);
            i *= i;
        } while(i < 1000000 && i != 0);

        System.out.println("");

        for (i = 100; i >= 0; i -=5) {
            System.out.println(i);
        }

        System.out.println("");

        for (i = 2; i < 1000000 && i != 0; i *= i) {
            System.out.println(i);
        }


    }
}
