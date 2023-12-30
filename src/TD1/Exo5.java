package TD1;
import java.util.Scanner;
public class Exo5 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            // Demander à l'utilisateur de saisir la langue
            System.out.println("Veuillez saisir la langue ('f' pour français, 'a' pour anglais): \n");
            String i=sc.nextLine();
            System.out.println("Entrer une heure");
            int h=sc.nextInt();
            switch(i){
                case "f":if((h>=0)&&(h<18))
                    System.out.println("Bonjour");
                else if (h<22)
                    System.out.println("Bonsoir");
                else System.out.println("Bonne nuit");
                    break;
                case "a": if((h>=0)&&(h<18))
                    System.out.println("Good Morning");
                else if (h<22)
                    System.out.println("Good Evening");
                else System.out.println("Good night");
                    break;
            }}}

