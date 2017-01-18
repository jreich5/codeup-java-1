import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by JustinReich on 1/17/17.
 */
public class Circle {
    private double radius;
    private static int objectCount = 0;

    public Circle(double radius) {
        this.radius = radius;
        objectCount++;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String getFormattedCircumference() {
        return formatNumber(getCircumference());
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public String getFormattedArea() {
        return formatNumber(getArea());
    }

    private String formatNumber(double x) {
        NumberFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(x);
    }

    public static int getObjectCount() {
        return objectCount;
    }
}
