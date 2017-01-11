import com.sun.corba.se.spi.activation.Server;

/**
 * Created by JustinReich on 1/8/17.
 */
public class ServerNameGenerator {
    String[] adjectives = {"Thankful", "Laughable", "Warm", "Abusive", "Aromatic", "Fretful", "Thundering", "Inconclusive", "Alcoholic", "Rabid"};
    String[] nouns = {"Attraction", "Bulb", "Gateway", "Indication", "Kilt", "License", "Mower", "Piccolo", "Program", "Student"};

    public int ranNumber() {
        return (int) (Math.random() * 10);
    }

    public String randomNameGenerator() {

        return adjectives[ranNumber()] + " " + nouns[ranNumber()];

    }

    public static void main(String[] args) {
        ServerNameGenerator sg = new ServerNameGenerator();
        sg.ranNumber();
        System.out.println(sg.randomNameGenerator());
    }
}
