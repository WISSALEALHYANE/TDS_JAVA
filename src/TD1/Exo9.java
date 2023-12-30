package TD1;
import java.util.Scanner;
public class Exo9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Déclaration des variables
        int var1,var2,temp;
        //Lecture des variables
        System.out.print("Entrez la première variable : ");
        var1 = sc.nextInt();
        System.out.print("Entrez la deuxième variable : ");
       var2 = sc.nextInt();
        if (var1 > var2) {
            temp = var1;
            var1 = var2;
            var2 = temp;}
        // Affichage des variables dans l'ordre croissant
        System.out.println("Variables dans l'ordre croissant : " + var1 + ", " + var2);

}}
