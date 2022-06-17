package heritage;

public class Voiture extends Vehicule {

//    public Voiture(int matricule, int anneeDeModele, float prix) {
//        super(matricule, anneeDeModele, prix);
//    }

    public Voiture( int anneeDeModele, float prix) {
        super(anneeDeModele, prix);
    }

    @Override
    public void demarrer(){
        System.out.println(" l'option demarrer est activee dans la voiture  !!");
    }

    @Override
    public void accelerer(){
        System.out.println(" l'option accelerer est activee dans la voiture !!");
    }
}
