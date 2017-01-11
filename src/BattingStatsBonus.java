import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by JustinReich on 1/11/17.
 */
public class BattingStatsBonus {
    // PROPERTIES

    private int numAtBats = 0;
    private int[] atBatResults;
    private boolean appRunning = true;
    private Scanner sc = new Scanner(System.in);
    public int numberOfBatters;
    public String[][] batterStats;

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
    private void requestAtBatNumber(int playerNumber) {
        System.out.println("Please enter the number of player " + playerNumber + " at bats: ");
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



    // create a method to run the program which will prompt the user for batting stats while they choose to continue
    public void runProgram() {
        System.out.println("Welcome to Batting Stats.");

        System.out.println("How many batters to enter?");
        numberOfBatters = sc.nextInt();

        batterStats = new String[numberOfBatters][2];

        int iterator = 0;

        for (String[] batter : batterStats) {
            iterator++;
            requestAtBatNumber(iterator);
            requestAtBatResults();

            double batAverage;
            double slugPercentage;
            batAverage = battingAverage(atBatResults, numAtBats);
            slugPercentage = sluggingPercentage(atBatResults, numAtBats);
            batter[0] = "Player" + iterator + " batting average is " + batAverage;
            batter[1] = "Player" + iterator + " slugging percentage is " + slugPercentage;
        }

        for (String[] batter : batterStats) {
            System.out.println(Arrays.toString(batter));
        }

    }

    // MAIN METHOD

    public static void main(String[] args) {
        // initialize application object
        BattingStatsBonus batStat = new BattingStatsBonus();
        batStat.runProgram();

    }
}
