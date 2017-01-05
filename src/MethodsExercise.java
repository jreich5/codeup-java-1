/**
 * Created by JustinReich on 1/5/17.
 */
public class MethodsExercise {
    public static void main(String[] args) {
        System.out.println(addNumbers(2.2, 2.5));
        System.out.println(subtractNumbers(10, 2));
        System.out.println(multiplyNumbers(2, 2));
        System.out.println(divideNumbers(2.2, 2.2));
        System.out.println(modNumbers(2.2, 2.2));
    }
    public static double addNumbers(double o1, double o2) {
        return o1 + o2;
    }

    public static double subtractNumbers(double o1, double o2) {
        return o1 - o2;
    }

    public static double multiplyNumbers(double o1, double o2) {
        return o1 * o2;
    }

    public static double divideNumbers(double o1, double o2) {
        return o1 / o2;
    }

    public static double modNumbers(double o1, double o2) {
        return o1 % o2;
    }
}

