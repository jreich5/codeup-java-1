import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JustinReich on 1/16/17.
 */
public class CountriesTextFile {

    public ArrayList<String> countriesData = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);
    public MyValidator validator = new MyValidator(sc);

    public void fileWriter(String filePath) {
        Path linesPath = Paths.get(filePath); //
        File linesFile = linesPath.toFile();
        try {
            PrintWriter out = new PrintWriter(linesFile);
            for (String country : countriesData) {
                out.println(country);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void countriesWrite(String filePath) {
        countriesData.clear();

        String newEntry = validator.getRequiredStringLine("Please enter a new country: ");

        Path linesPath = Paths.get(filePath); //
        File linesFile = linesPath.toFile();
        if (Files.exists(linesPath)) {
            try {
                FileReader r = new FileReader(linesFile);
                BufferedReader in = new BufferedReader(r); // returns input as a string
                String line = in.readLine(); // assigns the contents of a line to a variable "line"
                while (line != null) {
                    countriesData.add(line);
                    line = in.readLine();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        countriesData.add(newEntry);

        fileWriter(filePath);
    }

    public void countriesDelete(String filePath) {

        Path linesPath = Paths.get(filePath); //
        File linesFile = linesPath.toFile();
        if (Files.exists(linesPath) && !countriesData.isEmpty()) {
            countriesRead(filePath);
            System.out.println("");
            String entryToRm = validator.getRequiredStringLine("Please enter a country to remove: ");
            boolean entryMatch = false;
            int i = 0;
            for (String element : countriesData) {
                if (element.equals(entryToRm)) {
                    countriesData.remove(i);
                    entryMatch = true;
                    break;
                }
                i++;
            }
            if (!entryMatch) {
                System.out.println("No entry found by that name.");
            } else {
                fileWriter(filePath);
            }
        } else {
            System.out.println("No countries to delete.");
        }
    }

    public void countriesRead(String filePath) {

        Path linesPath = Paths.get(filePath); //
        File linesFile = linesPath.toFile(); //
        if (Files.exists(linesPath)) {
            try {
                FileReader r = new FileReader(linesFile);
                BufferedReader in = new BufferedReader(r); // returns input as a string
                String line = in.readLine(); // assigns the contents of a line to a variable "line"
                countriesData.clear();
                System.out.println("\nCOUNTRIES================\n");
                while (line != null) {
                    System.out.println(line);
                    countriesData.add(line);
                    line = in.readLine();
                }
                System.out.println("\n==========================");
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("\nNo entries have been created yet!");
        }
    }
}
