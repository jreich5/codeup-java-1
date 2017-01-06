import java.util.Scanner;

/**
 * Created by JustinReich on 1/6/17.
 */
public class PingPong {

    private String ballPosition;
    private String playerHit;
    private String computerHit;
    private int playerScore = 0;
    private int computerScore = 0;
    private int winningScore = 7;
    private String misser;
    private String turn;
    private boolean roundRunning = true;
    private boolean gameRunning = true;
    public Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        PingPong newGame = new PingPong();
        Scanner sc = new Scanner(System.in);
        newGame.runGame(sc);

    }

    private void validator() {
        try {
            playerHit = sc.next();
            if (!playerHit.equals("right") && !playerHit.equals("left")) {
                throw new Exception("Must enter lowercase 'left' or 'right'.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            playerServe();
        }
    }

    private void setBallPosition() {
        ballPosition = returnRandomDirection();
    }

    private void playerSwing(Scanner sc) {
        setBallPosition();
        System.out.println("The ball is headed your way! You hit 'right' or 'left'?:");
        validator();
        System.out.println("Player swings " + playerHit + "!");
        if (playerHit.equalsIgnoreCase(ballPosition)) {
            String playerHitMessage = "Player hits the ball!";
            System.out.println(playerHitMessage);
            turn = "computer";
        } else {
            String playerMissesMessage = "Player misses!!";
            System.out.println(playerMissesMessage);
            computerScore += 1;
            misser = "player miss!";
            System.out.println(misser);
            roundRunning = false;
        }
    }

    private void computerSwing() {
        System.out.println("Ball headed " + ballPosition + "!");
        computerHit = returnRandomDirection();
        System.out.println("Computer swings " + computerHit + "!");
        if (computerHit.equalsIgnoreCase(ballPosition)) {
            String computerHitMessage = "Computer hits the ball!";
            System.out.println(computerHitMessage);
            turn = "player";
        } else {
            String computerMissesMessage = "Computer misses!!";
            System.out.println(computerMissesMessage);
            playerScore += 1;
            misser = "computer miss!";
            roundRunning = false;
        }
    }

    private void computerServe() {
        computerHit = returnRandomDirection();
        ballPosition = computerHit;
        turn = "player";
    }

    private void playerServe() {
        System.out.println("Will you serve the ball 'right' or 'left'?");
        validator();

        System.out.println("Serving ball " + playerHit + "!");
        ballPosition = playerHit;
        turn = "computer";
    }

    private String returnRandomDirection() {
        int randomNumber = returnRandomNumber();
        return (randomNumber == 1) ? "right" : "left";
    }

    private int returnRandomNumber() {
        int random;
        random = (Math.random() <= 0.5) ? 1 : 2;
        return random;
    }

    private String returnRandomServer() {
        int random = returnRandomNumber();
        String server = (random == 1) ? "player" : "computer";
        return server;
    }

    private void runRound(Scanner sc, String server) {
        System.out.println("Player score is: " + playerScore + " and computer score is: " + computerScore + " and winning score is: " + winningScore);
        // run the round until someone misses
        System.out.println("The server is: " + server);
        if (server.equals("player turn")) {
            playerServe();
        } else {
            computerServe();
        }
        roundRunning = true;
        if (server.equals("player")) {
            playerServe();
        } else if (server.equals("computer")) {
            computerServe();
        }
        while (roundRunning) {
            if (turn.equals("player")) {
                playerSwing(sc);
            } else {
                computerSwing();
            }
        }
    }

    private void runGame(Scanner sc) {
        System.out.println("Welcome to Ping Pong Game!");

        // set server for the beginning of the game
        String server = returnRandomServer();

        // run rounds until someone wins
        while (gameRunning) {
            runRound(sc, server);
            if (misser.equals("player miss")) {
                server = "computer";
            } else {
                server = "player";
            }
            if (computerScore == 7 || playerScore == 7) {
                gameRunning = false;
            }
        }

        if (computerScore == winningScore) {
            String computerWinsMessage = "Computer WINS!!!";
            System.out.println(computerWinsMessage);
        } else {
            String playerWinsMessage = "Player WINS!!!";
            System.out.println(playerWinsMessage);
        }

    }


}
