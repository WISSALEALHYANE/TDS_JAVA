package TD3.Exo4;


public class Batiment {

    private String adresse;

    public Batiment() {}

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Adresse : " + adresse;
    }
}
