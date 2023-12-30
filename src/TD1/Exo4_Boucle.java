package TD1;
import java.util.Scanner;
public class Exo4_Boucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, p = 1;
        System.out.println("Entrez le premier entier : ");
        a = sc.nextInt();
        System.out.println("Entrez le deuxieme entier : ");
        b= sc.nextInt();
                // Vérification que les entiers sont positifs et non nuls
                if (a <= 0 || b <= 0) {
                    System.out.println("Erreur : les entiers doivent être positifs et non nuls.");
                } else {
                    // Calcul du PGCD en utilisant l'algorithme d'Euclide
                    for (int i = 1; i <= Math.min(a, b); i++) {
                        if (a % i == 0 && b %i == 0){
                            p = i;
                    }
                    // Affichage du résultat
                    System.out.println("Le Pgcd de a  et  b  est : " + p);}}}}
