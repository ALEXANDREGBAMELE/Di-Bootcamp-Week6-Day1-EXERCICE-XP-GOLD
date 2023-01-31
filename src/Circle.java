public class Circle {
    public double rayon = 1;
    public static String messageAv = "Pour rayon egal a ";
    public static String messageAp = " l'air du cercle vaut : ";

    /**
     * @param args
     *             Methode permettant de calculer l'air du cercle
     */

    public  double CircleArea() {
        return Math.PI * (this.rayon * this.rayon);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(12);
        Circle circle3 = new Circle(24);

        System.out.println("L'air du premier cercle est : ");

        double areaCircle1 = circle1.CircleArea();
        double areaCircle2 = circle2.CircleArea();
        double areaCircle3 = circle3.CircleArea();

        System.out.println(messageAv + circle1.rayon + messageAp + areaCircle1 );
        System.out.println(messageAv + circle2.rayon + messageAp + areaCircle2 );
        System.out.println(messageAv + circle3.rayon + messageAp + areaCircle3  + ", ");
        

    }

    public Circle(double rayon) {
        this.rayon = rayon;
    }

    public Circle(){
       
    }
}