/**
 * Created by JustinReich on 1/18/17.
 */
public class ComputerPlayer1 extends Player {
    @Override
    String generateRoshambo() {
        return Roshambo.toStr(Roshambo.ROCK);
    }

    public ComputerPlayer1(String playerName) {
        super(playerName);
    }
}
