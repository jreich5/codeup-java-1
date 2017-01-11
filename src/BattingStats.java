import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by JustinReich on 1/8/17.
 */
public class BattingStats {

    // PROPERTIES

    private int numAtBats = 0;
    private int[] atBatResults;
    private boolean appRunning = true;
    private Scanner sc = new Scanner(System.in);

    // METHODS

    // method to calculate batting average
    private double battingAverage(int[] atBatResults, int numAtBats) {
        int totalNumHits = 0;
        for (int atBat : atBatResults) {
            if (atBat > 0) {
                totalNumHits++;
            }
        }
        double battingAverage = (double) totalNumHits/(double) numAtBats;
        battingAverage = (int)Math.round(battingAverage * 1000)/(double)1000;
        return battingAverage;
    }

    // method to calculate slugging percentage
    private double sluggingPercentage(int[] atBatResults, int numAtBats) {
        int totalNumBases = 0;
        for (int atBat : atBatResults) {
            totalNumBases += atBat;
        }
        double sluggingPercentage = (double) totalNumBases/(double) numAtBats;
        sluggingPercentage = (int)Math.round(sluggingPercentage * 1000)/(double)1000;
        return sluggingPercentage;
    }

    // method to ask user for at bat number and sets the number to the atBatNumber property
    private void requestAtBatNumber() {
        System.out.println("Please enter the number of player at bats: ");
        int numberOfAtBats = validateNumAtBatInput(sc);
        numAtBats = numberOfAtBats;
    }

    // method to validate user input for number of at bats
    private int validateNumAtBatInput(Scanner sc) {
        int result = 0;
        boolean runLoop = true;
        while (runLoop) {
            try {
                result = sc.nextInt();
                if (result < 1) {
                    throw new Exception("Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch. Please enter an integer value");
                sc.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                continue;
            }
            runLoop = false;
        }
        return result;
    }

    // method to ask user for at bat number and sets the number to the atBatNumber property
    private void requestAtBatResults() {
        int[] batStatsArray = new int[numAtBats];
        System.out.println("Please enter the results of each of the " + numAtBats + " at bats (0-4): ");

        for (int i = 0; i < numAtBats; i++) {
            batStatsArray[i] = validateAtBatInput(sc);
        }

        atBatResults = batStatsArray;
    }

    // method to validate user input for at bat results
    private int validateAtBatInput(Scanner sc) {
        int result = 0;
        boolean runLoop = true;
        while (runLoop) {
            try {
                result = sc.nextInt();
                sc.nextLine();
                if (result < 0 || result > 4) {
                    throw new Exception("Please enter 0, 1, 2, 3, or 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
                sc.next();
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.next();
                continue;
            }
            runLoop = false;
        }
        return result;
    }

    // method to validate user input for continuing the program
    private String validateContinueInput(Scanner sc) {
        String result = null;
        boolean loopRunning = true;
        while (loopRunning) {
            try {
                result = sc.next().toLowerCase();
                if (!result.equals("y") && !result.equals("n")) {
                    throw new Exception("You must enter 'y' or 'n'");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a letter.");
                sc.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
                continue;
            }
            loopRunning = false;
        }
        return result;
    }

    // create a method to run the program which will prompt the user for batting stats while they choose to continue
    public void runProgram() {
        System.out.println("Welcome to Batting Stats.");
        while (appRunning) {
            requestAtBatNumber();
            requestAtBatResults();

            double batAverage;
            double slugPercentage;
            batAverage = battingAverage(atBatResults, numAtBats);
            slugPercentage = sluggingPercentage(atBatResults, numAtBats);

            System.out.println("Player batting average is " + batAverage + "\t Player slugging percentage is " + slugPercentage);
            System.out.println("Do you wish to enter information for a new player ('y' or 'n')?");
            String response = validateContinueInput(sc);
            if (response.equals("n")) appRunning = false;

        }
    }

    // MAIN METHOD

    public static void main(String[] args) {
        // initialize application object
        BattingStats batStat = new BattingStats();
        batStat.runProgram();

    }


}
