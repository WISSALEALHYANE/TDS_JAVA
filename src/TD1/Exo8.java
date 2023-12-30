package TD1;
import java.util.Scanner;
public class Exo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mois,année;
        System.out.println("Saisir le numéro des mois entre 1 et 12");
        mois=sc.nextInt();
        System.out.println("mois="+mois);
        //Les mois qui ont 30jours:Avril,Juin,Septembre et Novembre
        if((mois==4)||(mois==6)||(mois==9)||(mois==11)){
            System.out.println("Les jours de ce mois sont "+30);}
        //Les mois qui ont 31jours:Janvier,Mars,Mai,Juillet,Aout,Octobre et Décembre
        else if((mois==1)||(mois==3)||(mois==5)||(mois==7)||(mois==8)||(mois==10)||(mois==12)){
        System.out.println("Les jours de ce mois sont "+31);}
        //Le mois qui contient soit 28/29jours
       else { System.out.println("Saisir une année entre 1900 et 2100");
            année=sc.nextInt();
                if((année%100==0)&&(année%400==0)){
                    System.out.println("L'année est bissextile avec Février contient 29 JOURS"+29);}
                else if (année%100==0){
                    System.out.println("L'année est non bissextile avec Février contient 28 JOURS "+28);}

                }}}
