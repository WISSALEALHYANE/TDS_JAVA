package TD1;
import java.util.Scanner;
public class Exo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entrer la valeur de a");
        int a=s.nextInt();
        System.out.println("a="+a);
        System.out.println("Entrer la valeur de b");
        int b=s.nextInt();
        System.out.println("b="+b);
        System.out.println("Entrer la valeur de c");
        int c=s.nextInt();
        System.out.println("c="+c);
        int d = (b * b) - (4 * a * c);
        int x=-b/2*a;
        double x1=(-b-Math.sqrt(d))/2*a;
        double x2=(-b+Math.sqrt(d))/2*a;
        if (d == 0) {
            System.out.println("la solution de l'equation est: x= "+x);}
        else if (d > 0) {
            System.out.println("les solutions de l'equation sont: x1 = " + x1 + " et x2 = " + x2);
        }
                else if (d < 0) {
                    System.out.println("Il n'y a pas de solution dans IR");}





    }




}
