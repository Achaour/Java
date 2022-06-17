package heritage;

public class Camion extends Vehicule{

//    public Camion(int matricule, int anneeDeModele, float prix) {
//        super(matricule, anneeDeModele, prix);
//    }

    public Camion( int anneeDeModele, float prix) {
        super( anneeDeModele, prix);
    }

    @Override
    public void demarrer(){
        System.out.println(" l'option demarrer est activee dans le camion  !!");
    }

    @Override
    public void accelerer(){
        System.out.println(" l'option accelerer est activee dans le camion !!");
    }
}
