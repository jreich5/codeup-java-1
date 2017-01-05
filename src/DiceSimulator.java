import java.util.Scanner;

/**
 * Created by JustinReich on 1/5/17.
 */
public class DiceSimulator {
    public static void main(String[] args) {
        // Dice Exercise

        int sides;
        String answer;

        System.out.println("Welcome to the dice roller!");
        Scanner sc = new Scanner(System.in);

        System.out.println("How many sided dice should be rolled? ");
        sides = sc.nextInt();

        System.out.println("Do you wish to roll the pair of dice (y/n)? ");
        answer = sc.next();

        if (answer.equals("Y") || answer.equals("y")) {
            int dice1 = rollDice(sides);
            int dice2 = rollDice(sides);
            System.out.println("You rolled a " + dice1 + " and a " + dice2);
        }

    }

    public static int rollDice(int sidesOfDice) {
        return (int)(Math.random() * sidesOfDice - 1) + 1;
    }
}
