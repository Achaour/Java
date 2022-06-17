package heritage;

public abstract class Vehicule {
    private int matricule;
    private int anneeDeModele;
    private float prix;




//    public Vehicule(int matricule, int anneeDeModele, float prix) {
//        this.matricule = matricule;
//        this.anneeDeModele = anneeDeModele;
//        this.prix = prix;
//    }

    static int matricule_inc = 0;
//
    public Vehicule(int anneeDeModele, float prix) {



        this.anneeDeModele = anneeDeModele;
        this.prix = prix;
        matricule_inc++;
        this.matricule = matricule_inc;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public int getAnneeDeModele() {
        return anneeDeModele;
    }

    public void setAnneeDeModele(int anneeDeModele) {
        this.anneeDeModele = anneeDeModele;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }


    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", anneeDeModele='" + anneeDeModele + '\'' +
                ", prix=" + prix + " euros" +
                '}';
    }
}


