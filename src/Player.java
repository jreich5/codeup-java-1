/**
 * Created by JustinReich on 1/18/17.
 */
public abstract class Player {
    public String playerName;
    public String rValue;
    public int wins;

    abstract String generateRoshambo();

    public Player(String playerName) {
        this.playerName = playerName;
    }


}
