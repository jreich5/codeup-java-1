/**
 * Created by JustinReich on 1/18/17.
 */
public class ComputerPlayer2 extends Player {


    int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    @Override
    String generateRoshambo() {
        int random = randomWithRange(1, 3);
        switch (random) {
            case 1 : return Roshambo.toStr(Roshambo.PAPER);
            case 2 : return Roshambo.toStr(Roshambo.ROCK);
            case 3 : return Roshambo.toStr(Roshambo.SCISSORS);
            default : return null;
        }
    }
    public ComputerPlayer2(String playerName) {
        super(playerName);
    }
}
