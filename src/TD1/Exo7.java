package TD1;
import java.util.Scanner;
public class Exo7 {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        System.out.println("Entrer un entier de trois chiffres non nuls");
        int N;
        N=s.nextInt();
        if(N>=100 && N<=999)
         { int centaines = N/ 100;
             int dizaines = (N %100) / 10;
            int unites= N %10;
                         System.out.println("Centaines : " + centaines);
                         System.out.println("Dizaines : " + dizaines);
                         System.out.println("Unités : " + unites);

                     }
                 }
             }
