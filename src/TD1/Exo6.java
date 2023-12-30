package TD1;
import java.util.Scanner;
public class Exo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Entrer le nombre a");
        a=sc.nextInt();
        System.out.println("a="+a);
        System.out.println("Entrer le nombre b");
        b=sc.nextInt();
        System.out.println("b="+b);
        if(((a>0)&&(b>0))||((a<0)&&(b<0))){
            System.out.println("le produit est positif");}
        else {System.out.println("le produit est negatif");}
    }}
