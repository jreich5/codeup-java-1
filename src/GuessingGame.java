
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.jar.Pack200;

/**
 * Created by JustinReich on 12/31/16.
 */


public class GuessingGame {
    protected int computerNumber;
    protected int playerGuess;
    protected int min;
    protected int max;
    protected int numberOfGuesses;

    public GuessingGame(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void runGame() {
        System.out.println("Welcome to the guessing game!");
        this.setComputerNumber();
        this.setNumberOfGuesses();
        while (this.playerGuess != this.computerNumber && this.numberOfGuesses > 0) {
            System.out.println("You have " + this.numberOfGuesses + " guesses.");
            this.requestGuess();
            this.checkGuess();
        }
        if (this.playerGuess == this.computerNumber) {
            System.out.println("Good guess! You won!");
        } else {
            System.out.println("You ran out of guesses. Game over!");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to play again (y/n)?: ");
        if (sc.next().equals("y")) {
            runGame();
        }

    }

    protected void checkGuess() {
        if (this.playerGuess > this.computerNumber) {
            System.out.println("Too high");
        } else if (this.playerGuess < this.computerNumber) {
            System.out.println("Too low");
        }
    }

    protected void requestGuess() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please guess a number between " + this.min + " and " + this.max);
        try {
            this.playerGuess = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            requestGuess();
            this.numberOfGuesses += 1;
        }
        try {
            if (this.playerGuess > this.max || this.playerGuess < this.min) {
                throw new Exception("Out of range");
            } else {
                this.numberOfGuesses -= 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            requestGuess();
        }
    }

    protected void setComputerNumber() {
        int range = (this.max - this.min) + 1;
        this.computerNumber = (int)(Math.random() * range) + this.min;
    }

    protected void setNumberOfGuesses() {
        int max = this.max;
        int min = this.min;
        int total = max - min;
        int guesses = 0;
        while (total > 0) {
            guesses += 1;
            total /= 2;
        }
        guesses = guesses + 1;
        this.numberOfGuesses = guesses;
    }

    public static void main(String[] args) {
        GuessingGame gg = new GuessingGame(1, 10);
        gg.runGame();
    }

}

