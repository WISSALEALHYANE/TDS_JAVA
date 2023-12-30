package TD1;
import java.util.Scanner;
public class Exo1 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enterer 3 variables");
            int a;
            a=scanner.nextInt();
            System.out.println("a="+a);
            int b;
            b=scanner.nextInt();
            System.out.println("b="+b);
            int c;
            c=scanner.nextInt();
            System.out.println("c="+c);
            if((a>b)&&(a>c)){
                System.out.println("Le maximum des nombres est:"+a);}
            else if((b>a)&&(b>c)){
                System.out.println("Le maximum des nombres est:"+b);}
            else {
                System.out.println("Le maximum des nombres est:"+c);}

        }
    }



