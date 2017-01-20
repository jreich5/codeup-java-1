import java.util.Scanner;

/**
 * Created by JustinReich on 1/18/17.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        RoshamboApp game = new RoshamboApp();
        game.runGame();
    }

    public void runGame() {
        System.out.println("==== ROCK PAPER SCISSORS GAME ====");
        Scanner scan = new Scanner(System.in);
        MyValidator validator = new MyValidator(scan);
        Player pcPlayer = null;
        boolean runGame = true;
        String playerName = validator.getRequiredString("\nWhat is your name? ");
        System.out.println("Welcome, " + playerName + "!");
        Player human = new HumanPlayer(playerName);
        int playerWins;
        int computerWins;

        int opponentChoice = validator.getIntWithinRange("\nPlease choose a level of difficulty: \n\t1) Easy \n\t2) Hard\n", 1, 2);
        if (opponentChoice == 1) {
            pcPlayer = new ComputerPlayer1("RockComputer");
        } else {
            pcPlayer = new ComputerPlayer2("SmartComputer");
        }

        while (runGame) {
            boolean runRound = true;

            System.out.println("\n--------------------GAME ON--------------------");

            String humanResult = null;
            String pcResult = null;
            String formatting = "===================\n";
            while (runRound) {
                humanResult = human.generateRoshambo();
                pcResult = pcPlayer.generateRoshambo();
                System.out.println(human.playerName + " chooses " + humanResult);
                System.out.println(pcPlayer.playerName + " chooses " + pcResult);
                int round = determineWinner(humanResult, pcResult, human, pcPlayer);
                System.out.print(formatting);
                if (round != 0) runRound = false;
            }
            runGame = validator.yesNo("\nWould you like to play again (y/n)? ");
        }

        System.out.println("\nThank you for playing!");
        System.out.println("--------------------------------You won " + human.wins + " game(s)");
        System.out.println("--------------------------------The computer won " + pcPlayer.wins + " game(s)");
    }

    public static int determineWinner(String humanResult, String pcResult, Player humanObject, Player pcObject) {
        String[] rSet = {"rock", "paper", "scissors"};
        int human = java.util.Arrays.asList(rSet).indexOf(humanResult);
        int pc = java.util.Arrays.asList(rSet).indexOf(pcResult);

        int result = (pc + 3 - human ) % 3 ;

        if (result == 0 ) {
            System.out.println ("\nA tie!") ;
        } else if (result == 1) {
            System.out.print("");
            System.out.print(pcObject.playerName+ " wins!");
            pcObject.wins++;
        } else {
            System.out.println("");
            System.out.print(humanObject.playerName  + " WINS!");
            humanObject.wins++;
        }
        return result;
    }

}
