package TD1;
import java.util.Scanner;
public class Exo8_Boucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Entrer un entier N");
        N=sc.nextInt();
        for(int i =1;i<=N;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");}
            System.out.println(" ");}
        for(int i =N; i>0; i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");}
            System.out.println(" ");}}}