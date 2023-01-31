
import java.math.*;

public class Circle {
    static double rayon1 = 2.0;
    double rayon2 = 12;
    double rayon3 = 24;
    Circle circle1 = new Circle();
    Circle circle2 = new Circle();
    Circle circle3 = new Circle();

    /**
     * @param args
     *             Methode permettant de calculer l'air du cercle
     */

    public static double CircleArea(double r) {
        return Math.PI * (r * r);
    }

    public static void main(String[] args) {

        System.out.println("L'air du premier cercle est : " + Air1);

    }

}