package Biblio;

public  class Auteur {

    private String nom;

    private boolean indicationPrime;

    public Auteur(String nom, boolean indicationPrime) {
        this.nom = nom;
        this.indicationPrime = indicationPrime;
    }

    public Auteur() {

    }

    public String getNom(){
        return nom;
    }

    public boolean getPrix(){
        return indicationPrime;
    }
}
