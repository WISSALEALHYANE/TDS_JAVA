package TD1;
import java.util.Scanner;
public class Exo5_Boucle {
    public static void main(String[] args) {
        int N , Un=0, Un1=1, Un2=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The N:");
        N= scanner.nextInt();
        if (N==0 || N==1) {
            System.out.println(1);
            return;
        }
        System.out.print("1 1 ");
        for (int i = 2; i <= N; i++) {
            Un = Un1 + Un2;
            Un2=Un1;
            Un1 = Un;
            System.out.print(Un+ " ");

        }

    }
}












