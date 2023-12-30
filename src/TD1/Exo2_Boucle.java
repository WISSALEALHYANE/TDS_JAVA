package TD1;
import java.util.Scanner;
public class Exo2_Boucle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Entrez un entier N: ");
      N = sc.nextInt();
        int s =0;
        for(int i=1;i<N;i+=2){
                s+= i;}
        System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + s);
    }}



