package TD1;
import java.util.Scanner;
public class Exo3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Entrer la valeur de a");
            int a=s.nextInt();
            System.out.println("a="+a);
            System.out.println("Entrer la valeur de b");
            int b=s.nextInt();
            System.out.println("b="+b);
            System.out.println("Taper 1 pour savoir si la sommme de a+b est paire;\n"+
                               "2 pour savoir si le produit de a*b est pair;\n"+
                               "3 pour savoir le signe de la sommme de a+b;\n"+
                               "4 pour savoir le signe de produit de a*b;\n");
            int choix=s.nextInt();

switch(choix){
           case 1: if((a+b)%2==0)
             System.out.println("la somme de "+a+ "+"+b+" est paire");
            else
            System.out.println("la somme de "+a+ "+"+b+" est impaire");
            break;
            case 2:if((a*b)%2==0)
             System.out.println("le produit de "+a+ "*"+b+" est paire");
            else
             System.out.println("le produit de "+a+ "*"+b+" est impaire");
             break;
            case 3: if((a+b)>0)
             System.out.println(" Le signe de la somme de "+a+ "+"+b+" est positif");
            else
            System.out.println("le signe de la somme de "+a+ "+"+b+" est négatif");
            break;
            case 4: if((a*b)>0)
             System.out.println("le signe de produit de "+a+ "*"+b+" est positif");
            else
             System.out.println("le signe de produit de "+a+ "*"+b+" est négatif");
            break;}

        }}


