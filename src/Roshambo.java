/**
 * Created by JustinReich on 1/18/17.
 */
public enum Roshambo {
    ROCK, PAPER, SCISSORS;

    public static String toStr(Roshambo result) {
        switch (result) {
            case ROCK : return "rock";
            case PAPER : return "paper";
            case SCISSORS : return "Scissors";
            default : return null;
        }
    }

}
