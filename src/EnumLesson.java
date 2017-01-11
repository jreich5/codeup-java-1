/**
 * Created by JustinReich on 1/9/17.
 */
public class EnumLesson {

    private enum TrafficLightColor {
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) {
        EnumLesson.makeDrivingDecision(TrafficLightColor.YELLOW);
    }

    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case RED:
                System.out.println("Red means STOP!!!");
                break;
            case YELLOW:
                System.out.println("Yellow means come to a complete stop if it is safe to do so.");
                break;
            case GREEN:
                System.out.println("Green means GO!");
                break;
        }
    }

}
