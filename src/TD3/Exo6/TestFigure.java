package TD3.Exo6;
import TD3.Exo1.Point;

public class TestFigure {

    public static void main(String[] args) {

        Disque disque1 = new Disque();
        System.out.println("Disque 1 : " + disque1);

        Point centre = new Point(2, 3);
        Disque disque2 = new Disque(centre, 4.0, "Cercle A");
        System.out.println("Disque 2 : " + disque2);


        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 : " + rectangle1);

        Rectangle rectangle2 = new Rectangle(4.0, 8.0, "Rectangle A");
        System.out.println("Rectangle 2 : " + rectangle2);
    }
}

