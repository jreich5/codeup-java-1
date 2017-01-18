import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JustinReich on 1/16/17.
 */
public class CountriesApp {
    public static void main(String[] args) {
        CountriesApp.runApp();
    }

    public static void runApp() {
        CountriesTextFile ctf = new CountriesTextFile();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to the countries I/O program!");
        boolean loop = true;
        while (loop) {
            String options = "\nPlease enter an option number to perform an action:\nOption 1) Display entered countries\nOption 2) Enter a country\nOption 3) Delete\nOption 4) Exit\n\n";
            MyValidator mv = new MyValidator(sc);
            int result = mv.getIntWithinRange(options, 1, 4);
            switch(result) {
                case 1 : ctf.countriesRead("countries.txt");
                    break;
                case 2 : ctf.countriesWrite("countries.txt");
                    break;
                case 3 : ctf.countriesDelete("countries.txt");
                    break;
                case 4 : loop = false;
                    System.out.println("\nGoodbye!");
                    break;
            }
        }
    }
}

