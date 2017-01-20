import java.util.Scanner;

/**
 * Created by JustinReich on 1/18/17.
 */
public class HumanPlayer extends Player {
    @Override
    String generateRoshambo() {
        Scanner scan = new Scanner(System.in);
        MyValidator validator = new MyValidator(scan);
        boolean loop = true;
        String playerChoice = null;
        while (loop) {
            playerChoice = validator.getRequiredString("\nPlease type 'rock', 'paper', or 'scissors': ");
            if (!playerChoice.equalsIgnoreCase("rock") && !playerChoice.equalsIgnoreCase("paper") && !playerChoice.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid choice.");
            } else {
                loop = false;
            }
        }

        return playerChoice;

    }
    public HumanPlayer(String playerName) {
        super(playerName);
    }
}
