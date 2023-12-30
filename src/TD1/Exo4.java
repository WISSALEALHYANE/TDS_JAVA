package TD1;
import java.util.Scanner;
public class Exo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la moyenne");
        double Moy;
        Moy=scanner.nextDouble();
        if(Moy>=16)
            System.out.println("T.Bien");
        else
        if(Moy>=14)
            System.out.println("Bien");
        else
        if(Moy>=12)
            System.out.println("Assez.Bien");
        else
        if(Moy>=10)
            System.out.println("Passable");
        else
            System.out.println("Module Nv");

    }

}
