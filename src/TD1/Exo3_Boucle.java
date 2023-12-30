package TD1;
import java.util.Scanner;
public class Exo3_Boucle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,max=0,position=0;
        int nombre;
        System.out.println("Entrez 20 entiers N: ");
for (int i =0;i<20;i++){
    N=sc.nextInt();
    System.out.println("N = " + N);
    if(N>max){
        max=N;
    position =i;}}
        System.out.println("Le maximum des 20 entiers est: "+max);
System.out.println("Sa position est: "+position);
                do { System.out.print("Entrez un nombre (0 pour terminer) : ");
                    nombre = sc.nextInt();
                    if (nombre > max) {
                        max = nombre;}
                } while ( nombre != 0);
                System.out.println("Le maximum de la suite est : " + max);}}




