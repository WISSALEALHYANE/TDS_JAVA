package TD1;
import java.util.Scanner;
public class Exo1_Boucle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Calcul du factoriel
        int factoriel = 1;
        int N;
        System.out.println("The N:");
        N=sc.nextInt();
        for(int i=1; i<=N; i++){
            factoriel *= i;
        }
        // Affichage du résultat
        System.out.println("Le factoriel de " + N + " est : " + factoriel);}}


