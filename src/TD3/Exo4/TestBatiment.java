package TD3.Exo4;


public class TestBatiment {

    public static void main(String[] args) {

        Batiment batiment1 = new Batiment();
        System.out.println("Batiment 1 : " + batiment1);

        Batiment batiment2 = new Batiment("16 Rue de Agadir");
        System.out.println("Batiment 5: " + batiment2);


        Maison maison1 = new Maison();
        System.out.println("Maison 6 : " + maison1);

        Maison maison2 = new Maison("17 Rue de Fes", 1);
        System.out.println("Maison 1 : " + maison2);


        Immeuble immeuble1 = new Immeuble();
        System.out.println("Immeuble 2 : " + immeuble1);

        Immeuble immeuble2 = new Immeuble("4 Rue de Assila", 19);
        System.out.println("Immeuble 1 : " + immeuble2);
    }
}

